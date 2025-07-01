package org.example.OnedayCoding.Silver5.day16;

import java.util.Arrays;

public class P피로도 {

    class Solution {
        private static int[][] Dungeons;
        private static boolean[] visited;
        private static int answer = 0;
        public int solution(int k, int[][] dungeons) {
            Dungeons = dungeons;
            visited = new boolean[dungeons.length];

            Arrays.sort(Dungeons,(o1, o2) ->{
                return o2[0] - o1[0];
            });

            play(k, 0);
            return answer;
        }
        private static void play (int nowHealth, int count){
            for(int i = 0 ; i < Dungeons.length ; i++){
                if(!visited[i] && nowHealth >= Dungeons[i][0]){
                    visited[i] = true;
                    nowHealth -= Dungeons[i][1];
                    answer = Math.max(count + 1 , answer);
                    play(nowHealth, count + 1);

                    nowHealth += Dungeons[i][1];
                    visited[i] = false;
                }
            }
        }
    }
}
