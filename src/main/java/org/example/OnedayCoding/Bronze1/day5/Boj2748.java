package org.example.OnedayCoding.Bronze1.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2748 {
    // The main method must be in a class named "Main".
    class Main {
        private static long [] fiboArr;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            if(n == 0){
                System.out.println(0);
                return;
            }


            fiboArr = new long[n+1];
            fiboArr[0] = 0l;
            fiboArr[1] = 1l;


            for(int i = 2; i < n+1 ;i++){
                fiboArr[i] = fiboArr[i-1] + fiboArr[i-2];
            }
            System.out.println(fiboArr[n]);



            //     System.out.println(fibo(n));
            // }
            // private static int fibo(int n){
            //     if( n <= 1 ) return n;//종료 조건

            //     return fiboArr[n] = fibo(n-2) + fibo(n-1);
        }
    }
}
