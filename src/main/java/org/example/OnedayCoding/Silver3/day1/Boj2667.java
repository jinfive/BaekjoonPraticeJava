package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2667 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] dx = new int[]{-1 ,0 , 1, 0};//북, 동, 남, 서
        private static int[] dy = new int[]{0, 1, 0 ,-1};//북, 동, 남, 서
        private static int[][] map;
        private static boolean[][] visited;
        private static StringBuilder sb;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            map = new int[N][N];
            visited = new boolean[N][N];
            for(int i = 0 ; i < N ; i++){
                String input = br.readLine();
                for(int j = 0 ; j  < N ; j++){
                    map[i][j] = (int)input.charAt(j) -'0';
                }
            }
            int count = 0;
            List<Integer> answerList = new ArrayList<>();
            for(int i= 0 ; i < N ; i++){
                for(int j = 0 ; j < N ; j++){
                    if(map[i][j] == 1 && !visited[i][j]){
                        count++;
                        int result = DFS(i, j, 1);
                        answerList.add(result);
                    }
                }
            }
            Collections.sort(answerList);
            sb.append(count+"\n");
            for(int i = 0 ; i <answerList.size() ; i++){
                sb.append(answerList.get(i) +"\n");
            }
            System.out.print(sb.toString());
        }
        private static int DFS(int x, int y, int count){
            visited[x][y] = true;
            for(int i = 0 ; i < 4 ; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(nextX >= 0 && nextX < map.length && nextY >=0 && nextY < map.length && !visited[nextX][nextY] && map[nextX][nextY] == 1){
                    count = DFS(nextX, nextY, count + 1);

                }
            }
            return count;
        }
    }
}
