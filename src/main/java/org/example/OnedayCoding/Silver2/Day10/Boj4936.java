package org.example.OnedayCoding.Silver2.Day10;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Boj4936 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[][] map;
        private static StringBuilder sb;
        private static boolean[][] visited;
        private static int[] dx = new int[]{-1, 0 ,1, 0, -1, 1, 1, -1};//북, 동, 남, 서
        private static int[] dy = new int[]{0, 1, 0, -1, 1, 1, -1, -1};
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            sb = new StringBuilder();
            while (true) {
                st = new StringTokenizer(br.readLine());
                int w = Integer.parseInt(st.nextToken());//가로
                int h = Integer.parseInt(st.nextToken());//세로

                if(w == 0 && h == 0 ){
                    break;
                }
                map = new int[h][w];
                visited = new boolean[h][w];
                for(int i = 0 ; i < h ; i++){
                    st = new StringTokenizer(br.readLine());
                    for(int j = 0 ; j < w ; j++){
                        map[i][j] = Integer.parseInt(st.nextToken());
                    }
                }
                int count = 0;
                for(int i = 0 ; i < h ; i++){
                    for(int j = 0 ; j < w ; j++){
                        if(map[i][j] == 1 && !visited[i][j]){
                            visited[i][j] = true;
                            count++;
                            DFS(i , j);
                        }
                    }
                }
                sb.append(count +"\n");

            }
            System.out.print(sb.toString());
        }
        private static void DFS(int x, int y){
            for(int i = 0 ; i < 8 ; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(isVal(nextX, nextY)){
                    visited[nextX][nextY] = true;
                    DFS(nextX, nextY);
                }
            }
        }
        private static boolean isVal(int x, int y){
            if(x >= 0 && x < map.length && y >=0 && y < map[0].length && !visited[x][y] && map[x][y] == 1){
                return true;
            }
            return false;
        }
    }
}
