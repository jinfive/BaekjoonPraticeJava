package org.example.OnedayCoding.Bronze1.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2023 {
    // The main method must be in a class named "Main".
    class Main {
        private static int n;
        private static StringBuilder sb;
        public static void main(String[] args) throws Exception{
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

            n = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            DFS(2,1);
            DFS(3,1);
            DFS(5,1);
            DFS(7,1);


            System.out.println(sb.toString());
        }
        //DFS(숫자,자릿수)
        private static void DFS(int num, int numLength){
            if(numLength == n) {
                if(isPrime(num)){
                    sb.append(num +"\n");
                }
                return;//종료조건
            }
            for(int i = 1 ; i <= 9 ; i= i+2){
                if(isPrime(num * 10 + i)){
                    DFS(num * 10 + i , numLength +1);
                }
            }

        }
        private static boolean isPrime(int a){
            for(int i = 2; i < a/2 ;i++){
                if(a % i ==0) return false;
            }
            return true;
        }
    }
}
