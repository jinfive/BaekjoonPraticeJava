package org.example.OnedayCoding.Silver3.day1;

import java.util.ArrayDeque;
import java.util.Deque;

public class J_경주로건설 {
    

    class Solution {
        private static Deque<Road> dq;
        private static int answer = Integer.MAX_VALUE;
        private static int[][] Board;
        private static int[] dx = new int[]{-1, 0 ,1, 0};//북 동 남 서
        private static int[] dy = new int[]{0, 1, 0 ,-1};//북 동 남 서
        private static int[][][] minRoad;
        public int solution(int[][] board) {
            dq = new ArrayDeque<>();
            Board = board;
            minRoad = new int[4][board.length][board.length];
            for(int i = 0 ; i < 4 ; i ++){
                for(int j = 0 ; j < board.length ; j++){
                    for(int k = 0 ; k < board.length ; k++){
                        minRoad[i][j][k] = Integer.MAX_VALUE;
                    }
                }
            }
            dq.add(new Road(0, 0, 0, -1));
            while(!dq.isEmpty()){

                Road now = dq.poll();

                if(now.cost >= answer){
                    continue;
                }
                if(now.cost > 0 && minRoad[now.dir][now.x][now.y] <= now.cost){
                    continue;
                }
                else if(now.cost > 0){
                    minRoad[now.dir][now.x][now.y] = now.cost;
                }

                if(now.x == board.length - 1 && now.y == board.length - 1){
                    answer = Math.min(answer, now.cost);
                }

                if(now.cost == 0){
                    for(int i = 0 ; i < 4 ; i++){
                        int nextX = now.x + dx[i];
                        int nextY = now.y + dy[i];
                        if(nextX >= 0 && nextX < board.length && nextY >= 0
                                && nextY < board.length && board[nextX][nextY] != 1){
                            dq.add(new Road(nextX, nextY, 100, i));
                        }
                    }
                }
                else{
                    for(int i = 0 ; i < 4 ; i++){
                        int nextX = now.x + dx[i];
                        int nextY = now.y + dy[i];
                        if(nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board.length
                                && board[nextX][nextY] != 1){
                            int nextCost = calculation(now.dir ,i, now.cost);
                            dq.add(new Road(nextX, nextY, nextCost, i));
                        }
                    }
                }
            }
            return answer;
        }
        private static class Road{
            int x;
            int y;
            int cost;
            int dir;
            public Road(int x, int y, int cost, int dir){
                this.x = x;
                this.y = y;
                this.cost = cost;
                this.dir = dir;
            }
        }
        private static int calculation(int nowDir, int nextDir, int cost){
            if((Math.max(nextDir, nowDir) - Math.min(nextDir, nowDir)) % 2 == 1){//방향이 바뀜
                return cost + 600;
            }
            return cost + 100;
        }
    }
}
