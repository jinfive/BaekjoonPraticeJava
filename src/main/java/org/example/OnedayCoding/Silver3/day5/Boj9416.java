package org.example.OnedayCoding.Silver3.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj9416 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            long[] D = new long[101];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int test = Integer.parseInt(br.readLine());
            D[1] = 1;
            D[2] = 1;
            D[3] = 1;
            D[4] = 2;
            D[5] = 2;
            for(int i =6 ; i < 101; i++){
                D[i] = D[i - 1] + D[i - 5];
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < test ; i++){
                int n = Integer.parseInt(br.readLine());
                sb.append(D[n] +"\n");
            }
            System.out.print(sb.toString());
        }
    }
}
