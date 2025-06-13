package org.example.OnedayCoding.Silver5.day6;

public class P_붕대감기 {
    class Solution {
        private static int time;
        private static int healingTime;
        private static int answer = 0;
        private static int[] attackTime;
        public int solution(int[] bandage, int health, int[][] attacks) {
            //초기화
            int maxHealth = health;
            time = attacks[attacks.length - 1][0];
            healingTime = 0;
            attackTime = new int[attacks.length];
            for(int i = 0 ; i < attacks.length ; i++){
                attackTime[i] = attacks[i][0];
            }

            //System.out.println(time);
            for(int i = 0 ; i <= time ;i++){
                //몬스터가 공격을 하는지
                if(health >= maxHealth){
                    health = maxHealth;
                }
                boolean attack = false;
                int j = 0;
                for(; j < attackTime.length ; j++){
                    if(i == attackTime[j]){//공격을 해버림
                        attack = true;
                        break;
                    }
                }
                if(attack){
                    healingTime = 0;
                    int damage = 0;
                    for(int k = 0 ; k < attacks.length ; k++){
                        if(attacks[k][0] == attackTime[j]){
                            damage = attacks[k][1];
                        }
                    }
                    health -= damage;
                    if(health <= 0) return -1;
                }
                //몬스터가 공격을 안할때
                else{
                    healingTime++;
                    health += bandage[1];
                    if(healingTime == bandage[0]){
                        health += bandage[2];
                        healingTime = 0;
                    }
                }
            }
            answer = health;
            return answer;
        }
    }
}
