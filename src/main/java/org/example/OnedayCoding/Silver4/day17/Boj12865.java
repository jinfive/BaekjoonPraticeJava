package org.example.OnedayCoding.Silver4.day17;

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
            int[][] dp = new int[N+1][K+1];
            int[][] item = new int[N][2];
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());//무게
                int b = Integer.parseInt(st.nextToken());//가치
                item[i][0] = a;
                item[i][1] = b;
            }
            int answer = 0;
            for(int i = 1 ; i < N + 1 ; i++){
                for(int j = 1 ; j < K + 1 ; j++){
                    dp[i][j] = dp[i-1][j];
                    if(j - item[i- 1][0] >= 0){
                        dp[i][j] = Math.max(dp[i][j],dp[i-1][j - item[i-1][0]] + item[i-1][1] );

                    }
                    answer= Math.max(answer, dp[i][j]);

                }
            }
            System.out.println(answer);

        }
    }
}
