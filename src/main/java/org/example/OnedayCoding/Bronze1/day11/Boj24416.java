package org.example.OnedayCoding.Bronze1.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj24416 {
    
    // The main method must be in a class named "Main".
    class Main {
        private static int count1 = 0;
        private static int count2 = 0;;
        private static int[] dp;
        private static ArrayList<Integer> myList;
        public static void main (String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n  = Integer.parseInt(br.readLine());
            rFib(n);
            System.out.println(count1);
            dFid(n);
            System.out.println(count2);

        }
        //재귀 피보나치(fib(n - 1) + fib(n - 2));
        private static int rFib(int n){

            if(n == 1 || n == 2){
                count1++;
                return 1;
            }
            else{
                return rFib(n -1 ) + rFib(n - 2);
            }
        }
        //dp 피보나치  f[i] = f[i - 1] + f[i - 2];
        private static void dFid(int n){
            dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 1;
            for(int i = 3 ; i <= n ; i++){
                dp[i] = dp[i-1] + dp[i-2];
                count2++;
            }
        }


    }
}
