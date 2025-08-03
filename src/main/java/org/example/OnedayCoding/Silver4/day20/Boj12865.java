package org.example.OnedayCoding.Silver4.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12865 {
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] DP = new int[N + 1][K + 1];
            int[][] bags = new int[N][2];//무게, 가치
            for(int i = 0 ; i < N ; i ++){
                st = new StringTokenizer(br.readLine());
                bags[i][0] = Integer.parseInt(st.nextToken());//무게
                bags[i][1] = Integer.parseInt(st.nextToken());//가치
            }
            for(int i = 1 ; i < DP.length ; i++){
                for(int j = 1 ; j < DP[i].length ; j++){
                    if(bags[i - 1][0] > j){
                        DP[i][j] = DP[i - 1][j];
                    }
                    else{
                        DP[i][j] = Math.max(DP[i - 1][j] , bags[i - 1][1] + DP[i - 1][j - bags[i - 1][0]]);
                    }

                }
            }
            int answer = 0;
            for(int i = 1 ; i < DP.length ; i++){
                for(int j = 0 ; j < DP[i].length ; j++){
                    answer = Math.max(DP[i][j] , answer);
                }
            }
            System.out.println(answer);
        }
    }
}
