package org.example.OnedayCoding.Silver5.day4;

public class J_퍼즐게임챌린지 {

    class Solution {
        private static int answer = 0;
        private static int[] Diffs;
        private static int[] Times;
        private static long Limit;
        private static Long clearTime;//다 했을때 걸린시간
        private static Long saveClearTime;//다 했을때 걸린시간 저장
        private static boolean find;
        public int solution(int[] diffs, int[] times, long limit) {
            //초기화
            Diffs = diffs;
            Times = times;
            Limit = limit;
            find = true;
            saveClearTime = Long.MAX_VALUE;
            int startLv = diffs[0];
            while(true){
                if(!find){
                    break;
                }
                solve(startLv);
                startLv++;
            }

            return answer;
        }
        private static void solve(int startLv){
            int count = 0;
            clearTime = 0l;
            for(count = 0 ; count < Diffs.length ; count++){

                //풀수 있을때
                if(startLv >= Diffs[count]){
                    clearTime+= Times[count];
                }
                //풀수 없을때
                else{
                    long tryC = (long)Diffs[count] - startLv;
                    clearTime += tryC * (Times[count] + Times[count -1]) + Times[count];
                }

            }
            if(count == Diffs.length){

                if(clearTime <= Limit){
                    System.out.println(startLv);
                    answer = startLv;
                    find = false;
                }
            }
        }
    }
}
