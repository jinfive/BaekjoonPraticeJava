package org.example.OnedayCoding.Silver4.day11;

import java.util.Arrays;

public class J_피로도 {

    class Solution {
        private static int answer = 0;
        private static int[][] Dungeons;
        private static boolean[] visited;
        public int solution(int k, int[][] dungeons) {
            Dungeons = dungeons;
            visited = new boolean[Dungeons.length];
            Arrays.sort(Dungeons, (o1, o2)->{
                return o2[0] - o1[0];
            });
            play(k, 0);
            return answer;
        }
        private static void play(int nowHp,int clear){
            answer = Math.max(clear, answer);
            for(int i = 0 ; i < Dungeons.length ; i++){
                if(Dungeons[i][0] <= nowHp && !visited[i]){
                    visited[i] = true;
                    play(nowHp - Dungeons[i][1], clear + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
