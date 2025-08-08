package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj14502 {

    // The main method must be in a class named "Main".
    class Main {
        private static int N;
        private static int M;
        private static Deque<int[]> dq;
        private static int[][] map;
        private static int[] dx= new int[]{-1, 0 , 1, 0};//북 동 남 서
        private static int[] dy= new int[]{0 , 1, 0 , -1};//북 동 남 서
        private static int answer = Integer.MIN_VALUE;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());


            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < M ; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            creatWall(0);
            System.out.println(answer);
        }
        private static void creatWall(int dept){
            if(dept == 3){
                birus(map);
                return;
            }
            for(int i = 0 ; i < N ; i ++){
                for(int j = 0 ; j < M ; j++){
                    if(map[i][j] == 0){
                        map[i][j] = 1;
                        creatWall(dept + 1);
                        map[i][j] = 0;
                    }
                }
            }

        }
        private static void birus(int[][] map){
            //맵 복사
            int[][] copyMap = new int[N][M];
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < M ; j++){
                    copyMap[i][j] = map[i][j];
                }
            }
            dq = new ArrayDeque<>();
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < M; j++){
                    if(copyMap[i][j] == 2){
                        dq.add(new int[]{i, j});
                    }
                }
            }
            while(!dq.isEmpty()){
                int[] now = dq.poll();//0은 x , 1 은 y
                for(int i = 0 ; i < 4 ; i++){
                    int nextX = now[0] + dx[i];
                    int nextY = now[1] + dy[i];
                    if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M && copyMap[nextX][nextY] == 0){
                        copyMap[nextX][nextY] = 2;
                        dq.add(new int[]{nextX, nextY});
                    }
                }

            }
            counting(copyMap);

        }
        private static void counting(int[][] map){
            int count = 0;
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < M ; j++){
                    if(map[i][j] == 0){
                        count++;
                    }
                }
            }
            answer = Math.max(answer, count);
        }
    }
}
