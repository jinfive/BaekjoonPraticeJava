package org.example.OnedayCoding.Silver5.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj15686 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[][] maps;
        private static List<int[]> houseList;
        private static List<int[]> chickenList;
        private static int answer = Integer.MAX_VALUE;
        private static int M;
        private static List<Integer> selectList;
        private static boolean[] visited;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            selectList = new ArrayList<>();
            chickenList = new ArrayList<>();
            houseList = new ArrayList<>();
            maps = new int[n][n];
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < n ; j++){
                    int now = Integer.parseInt(st.nextToken());
                    maps[i][j] = now;
                    if(now == 1){//집일때
                        houseList.add(new int[]{i,j});
                    }
                    if(now == 2){//닭집일때
                        chickenList.add(new int[]{i,j});
                    }
                }
            }
            visited = new boolean[chickenList.size()];
            findChicken(0,0);
            System.out.println(answer);



        }
        private static void findChicken(int dept, int start){
            if(dept == M){
                int sum = 0;
                for(int[] h : houseList){
                    int min = Integer.MAX_VALUE;
                    for(int idx : selectList){
                        int[] c = chickenList.get(idx);
                        int d = Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]);
                        min = Math.min(d, min);
                    }
                    sum += min;
                }
                answer = Math.min(answer , sum);
                return;
            }

            //치킨 조합 만들기
            for(int i = start ; i < chickenList.size() ; i++){
                if(!visited[i]){
                    visited[i] = true;
                    selectList.add(i);
                    findChicken(dept + 1, i + 1);
                    selectList.remove(selectList.size() - 1);
                    visited[i] = false;
                }
            }


        }
    }
}
