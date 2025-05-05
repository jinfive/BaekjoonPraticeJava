package org.example.OnedayCoding.Bronze1.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2023 {

    class Main {
        private static StringBuilder sb = new StringBuilder();
        private static int num;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            DFS(2,1);
            DFS(3,1);
            DFS(5,1);
            DFS(7,1);
            System.out.println(sb.toString());

        }
        private static void DFS(int n , int c){
            if( c == num){
                if(isPrime(n)){
                    sb.append(n +"\n");
                }
                return;
            }
            else if(isPrime(n)){
                for(int i = 1; i < 10 ;i++){
                    if(i % 2 ==0) continue;
                    DFS(n * 10 + i , c +1);
                }

            }
        }
        private static boolean isPrime(int n){
            for(int i = 2 ; i <= n/2 ; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

}
