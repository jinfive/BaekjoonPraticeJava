package org.example.OnedayCoding.Silver3.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj7569 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] dx = new int[]{-1, 0 ,1, 0};//북, 동, 남, 서
        private static int[] dy = new int[]{0, 1, 0 , -1};//북, 동, 남, 서
        private static int[] dz = new int[]{1, -1};//상,하
        private static int M;//가로
        private static int N;//세로
        private static int H;//높이
        private static Deque<Tomato> dq;
        private static int[][][] map;
        private static boolean[][][] visited;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());//가로
            N = Integer.parseInt(st.nextToken());//세로
            H = Integer.parseInt(st.nextToken());//높이
            map = new int[H][N][M];
            visited = new boolean[H][N][M];
            dq = new ArrayDeque<>();
            for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < N ; j++){
                    st = new StringTokenizer(br.readLine());
                    for(int k = 0 ; k < M ; k++){
                        map[i][j][k] = Integer.parseInt(st.nextToken());
                        if(map[i][j][k] == 1){
                            visited[i][j][k] = true;
                            dq.add(new Tomato(j, k, i, 1));
                        }
                    }
                }
            }
            for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < N ; j++){
                    for(int k = 0 ; k < M ; k++){
                        System.out.print(map[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            while(!dq.isEmpty()){
                Tomato now = dq.poll();
                for(int i = 0; i < 4 ; i++){
                    int nextX = now.x + dx[i];
                    int nextY = now.y + dy[i];
                    if(isVal(now.z, nextX, nextY)){//상하좌우 탐색
                        dq.add(new Tomato(nextX, nextY, now.z, now.day + 1));
                        map[now.z][nextX][nextY] = now.day + 1;
                        visited[now.z][nextX][nextY] = true;
                    }
                }
                for(int i = 0 ; i < 2 ; i++){
                    int nextZ = now.z + dz[i];
                    if(isVal(nextZ, now.x , now.y)){
                        dq.add(new Tomato(now.x, now.y, nextZ, now.day + 1));
                        map[nextZ][now.x][now.y] = now.day + 1;
                        visited[nextZ][now.x][now.y] = true;
                    }
                }
            }
            int answer = Integer.MIN_VALUE;
            for(int i = 0 ; i < H ; i++){
                for(int j = 0 ; j < N ; j++){
                    for(int k = 0 ; k < M ; k++){
                        if(map[i][j][k] == 0){
                            System.out.println(-1);
                            return;
                        }
                        answer = Math.max(answer, map[i][j][k]);
                    }
                }
            }
            System.out.println(answer - 1);



        }
        private static class Tomato{
            int x;
            int y;
            int z;
            int day;
            public Tomato(int x, int y, int z, int day){
                this.x = x;
                this.y = y;
                this.z = z;
                this.day = day;
            }
        }
        private static boolean isVal(int z, int x, int y){
            if(z >= 0 && z < H && x >= 0 && x < N && y >= 0 && y < M && map[z][x][y] != -1 && map[z][x][y] == 0 && !visited[z][x][y]){
                return true;
            }
            return false;
        }
    }
}
