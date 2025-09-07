package org.example.OnedayCoding.Silver3.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11504 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];
            int[] dp1 = new int[n + 1];
            int[] dp2 = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 1 ; i <= n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 1 ; i < arr.length ; i ++){
                for(int j = 0 ; j < i ; j++){
                    if(arr[i] > arr[j]){
                        dp1[i] = Math.max(dp1[i], dp1[j] + 1);
                    }
                }
            }

            for(int i = arr.length - 2 ; i >= 1 ; i --){
                for(int j = arr.length - 1 ; j > i ; j--){
                    if(arr[i] > arr[j]){
                        dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                    }
                }
            }

            int answer = 0;
            for(int i = 0 ; i < dp2.length ; i++){
                dp2[i] += dp1[i];
                if(answer < dp2[i]){
                    answer = dp2[i];
                }
            }
            System.out.print(answer );

        }
    }
}
