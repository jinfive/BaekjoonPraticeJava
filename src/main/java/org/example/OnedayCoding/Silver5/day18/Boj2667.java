package org.example.OnedayCoding.Silver5.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2667 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[][] maps;
        private static boolean[][] visited;
        private static List<Integer> answerList;
        private static int[] dx = new int[]{-1, 0, 1, 0};//북,동,남,서
        private static int[] dy = new int[]{0, 1, 0, -1};//북,동,남,서
        public static void main(String[] args) throws Exception{
            // System.out.println("Hello world!");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            maps = new int[n][n];
            for(int i = 0 ; i < n ; i++){
                String input = br.readLine();
                for(int j = 0 ; j < n ; j++){
                    maps[i][j] = (int)input.charAt(j) - '0';
                    //System.out.print(maps[i][j]+" ");
                }
                //System.out.println();
            }
            visited = new boolean[n][n];
            answerList = new ArrayList<>();

            for(int i = 0 ; i < n ; i++){

                for(int j = 0 ; j < n ; j++){
                    if(maps[i][j] == 1 && !visited[i][j]){
                        int count =  findApt(i, j);
                        answerList.add(count);
                    }

                }

            }


            System.out.println(answerList.size());
            Collections.sort(answerList);
            for(int i = 0 ; i < answerList.size() ; i++){
                System.out.println(answerList.get(i));
            }



        }
        private static int findApt(int x, int y){
            visited[x][y] = true; // 방문 처리
            int count = 1;
            for(int i = 0 ; i < 4 ; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(nextX >= 0 && nextY >= 0 && nextX < maps.length && nextY < maps.length && !visited[nextX][nextY] && maps[nextX][nextY] == 1){
                    count += findApt(nextX, nextY); //이부분을 잘 몰랐
                }
            }


            return count;
        }

    }
}
