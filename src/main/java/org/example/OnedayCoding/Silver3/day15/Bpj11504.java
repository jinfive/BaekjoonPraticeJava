package org.example.OnedayCoding.Silver3.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bpj11504 {
    
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n + 1];
            for(int i = 1  ; i  < n  + 1 ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int[] dp1 = new int[n +1];
            int[] dp2 = new int[n +1];

            for(int i = 1 ; i < arr.length ; i++){
                for(int j = 0 ; j < i ; j++){
                    if(arr[i] > arr[j]){
                        dp1[i] = Math.max(dp1[j] + 1 , dp1[i]);
                    }
                }
            }

            for(int i = arr.length - 2 ; i >= 0 ; i--){
                for(int j = arr.length - 1 ; j > i ; j--){
                    if(arr[i] > arr[j]){
                        dp2[i] = Math.max(dp2[j] + 1 , dp2[i]);
                    }
                }
            }
            for(int i = 0 ; i < n  + 1 ; i ++){
                System.out.print(dp1[i] + " ");
            }
            System.out.println();
            for(int i = 0 ; i < n  + 1 ; i ++){
                System.out.print(dp2[i] + " ");
            }
            int answer = Integer.MIN_VALUE;
            for(int i = 0 ; i <  dp1.length ; i++){
                dp1[i] = dp1[i] + dp2[i];
                answer = Math.max(answer, dp1[i]);
            }
            System.out.println(answer);

        }
    }
}
