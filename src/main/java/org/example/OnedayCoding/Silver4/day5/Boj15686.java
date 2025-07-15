package org.example.OnedayCoding.Silver4.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj15686 {


    // The main method must be in a class named "Main".
    class Main {
        private static List<int[]> homeList;
        private static List<int[]> chickenList;
        private static List<Integer> answerList;
        private static int N;
        private static int M;
        private static int[][] maps;
        private static List<int[]> combiList;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            maps = new int[N][N];
            M = Integer.parseInt(st.nextToken());
            homeList = new ArrayList<>();
            chickenList = new ArrayList<>();
            answerList = new ArrayList<>();
            combiList = new ArrayList<>();
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < N ; j++){
                    maps[i][j] = Integer.parseInt(st.nextToken());
                    if(maps[i][j] == 1){//아파트
                        homeList.add(new int[]{i, j});
                    }
                    else if(maps[i][j] == 2){//닭집
                        chickenList.add(new int[]{i, j});
                    }
                }
            }
            find(0);
            Collections.sort(answerList);
            System.out.println(answerList.get(0));
        }
        private static void find (int start){
            int sum = 0;
            if(combiList.size() == M){
                for(int i = 0 ; i < homeList.size() ; i++){
                    int street = Integer.MAX_VALUE;
                    for(int j = 0 ; j < combiList.size() ; j++){
                        street = Math.min(street, Math.abs(combiList.get(j)[0] - homeList.get(i)[0]) + Math.abs(combiList.get(j)[1] - homeList.get(i)[1]));
                    }
                    sum += street;
                }
                answerList.add(sum);

                return;
            }
            for(int i = start ; i < chickenList.size() ; i++){
                combiList.add(chickenList.get(i));
                find(i + 1);
                combiList.remove(combiList.size() - 1);
            }
        }
    }
}
