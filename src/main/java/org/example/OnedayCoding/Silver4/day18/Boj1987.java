package org.example.OnedayCoding.Silver4.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1987 {
   

    // The main method must be in a class named "Main".
    class Main {
        private static int answer = -1;
        private static Map<Character, Integer> alpMap;
        private static int R;
        private static int C;
        private static char[][] map;
        private static int[]dx = new int[]{-1, 0, 1, 0};//북동남서
        private static int[]dy = new int[]{0, 1, 0, -1};//북동남서

        public static void main(String[] args) throws Exception {
            alpMap = new HashMap<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            map = new char[R][C];
            for(int i = 0 ; i < R ; i++){
                String line = br.readLine();
                for(int j = 0 ; j < C ; j++){
                    map[i][j] = line.charAt(j);
                }
            }
            alpMap.put(map[0][0], 1);
            DFS(0, 0, 1);
            System.out.println(answer);


        }
        private static void DFS(int x, int y, int count){
            // System.out.println(x +" " + y + " " + count);
            answer = Math.max(count, answer);
            for(int i = 0 ; i < 4 ; i++){
                if(isVal(x + dx[i] , y+ dy[i])){
                    if(!alpMap.containsKey(map[x + dx[i]][y + dy[i]])){
                        alpMap.put(map[x + dx[i]][y + dy[i]], 1);
                        DFS(x + dx[i], y + dy[i], count + 1);
                        alpMap.remove(map[x + dx[i]][y + dy[i]]);
                    }
                }
            }
        }
        private static boolean isVal(int x, int y){
            if(x >= 0 && x < R && y >= 0 && y < C){
                return true;
            }
            return false;
        }
    }
}
