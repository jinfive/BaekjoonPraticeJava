package org.example.OnedayCoding.Silver5.day2;

import java.util.Arrays;

public class P_피로도 {

    class Solution {
        private static boolean[] visited;
        private static int answer = 0;
        private static int[][] Dungeons;
        public int solution(int k, int[][] dungeons) {
            visited = new boolean [dungeons.length];
            Dungeons = dungeons;
            Arrays.sort(dungeons,(o1, o2)->{
                return o2[0] - o1[0];
            });
            playGame(0,k);
            return answer;
        }
        private static void playGame(int count, int k){
            for(int i = 0 ; i < visited.length ; i++){
                if(k >= Dungeons[i][0] && !visited[i]){
                    visited[i] = true;
                    playGame(count+1, k - Dungeons[i][1]);
                    answer = Math.max(count+1,answer);
                    visited[i] = false;

                }
            }
        }
    }
}
