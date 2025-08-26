package org.example.OnedayCoding.Silver3.day12;

public class NQueen {
    class Solution {
        private static int[] map;
        private static int N;
        private static int answer = 0;
        public int solution(int n) {
            map = new int[n];
            N = n;
            chess(0);
            return answer;
        }
        private static void chess (int num){
            if(num == N){
                answer++;
                return;
            }
            for(int i = 0 ; i < N ; i++){
                map[num] = i;
                if(isVal(num)){
                    chess(num + 1);
                }
            }
        }
        private static boolean isVal(int num){
            //가로 검사
            for(int i = 0 ; i < num ; i++){
                if(map[num] == map[i]){
                    return false;
                }
            }
            //대각선 검사
            for(int i = 0 ; i < num ; i++){
                if(Math.abs(num - i) == Math.abs(map[num] - map[i])){
                    return false;
                }
            }
            return true;
        }
    }
}
