package org.example.OnedayCoding.Silver4.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj7576 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] dx = new int[]{-1, 0, 1, 0};//행 북 동 남 서
        private static int[] dy = new int[]{0, 1, 0 ,-1};//열 북 동 남 서
        private static int N;//열
        private static int M;//행
        private static int answer;
        private static int[][] tomato;
        private static Deque<TomatoState> dq;
        private static boolean visited[][];
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            tomato = new int[M][N];
            visited = new boolean[M][N];
            answer = 0;
            dq = new ArrayDeque<>();
            for(int i = 0 ; i < M ; i ++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < N ; j++){
                    tomato[i][j] = Integer.parseInt(st.nextToken());
                    if(tomato[i][j] == 1){
                        dq.add(new TomatoState(i, j, 1));
                        visited[i][j] = true;
                    }
                }
            }



            while(!dq.isEmpty()){
                TomatoState now = dq.poll();
                int nowX = now.x;
                int nowY = now.y;
                int nowDay = now.day;
                for(int i = 0 ; i < 4 ; i++){
                    int nextX = nowX + dx[i];
                    int nextY = nowY + dy[i];
                    if(isVal(nextX, nextY)){
                        dq.add(new TomatoState(nextX, nextY, nowDay + 1));
                        visited[nextX][nextY] = true;
                        answer = Math.max(nowDay + 1 , answer);
                    }
                }
            }
            boolean canAllRipe = true;
            for(int i = 0; i < M; i++){
                for(int j = 0; j < N; j++){
                    if(tomato[i][j] == 0 && !visited[i][j]){
                        canAllRipe = false;
                        break;
                    }
                }
                if(!canAllRipe) break;
            }

            if(!canAllRipe){
                System.out.println(-1);
            }
            else if(answer == 0){
                System.out.println(answer);
            }

            else {
                System.out.println(answer - 1);
            }




        }
        private static class TomatoState{
            int x;
            int y;
            int day;
            public TomatoState(int x, int y, int day){
                this.x = x;
                this.y = y;
                this.day = day;
            }
        }
        private static boolean isVal(int x, int y){
            if(x >= 0 && x < M && y >=0 && y < N && tomato[x][y] > -1 && !visited[x][y]){
                return true;
            }
            return false;
        }
    }
}
