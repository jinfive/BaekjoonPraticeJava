package org.example.OnedayCoding.Silver5.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj11726 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            long[] D = new long[1001];
            D[1] = 1;
            D[2] = 2;
            for(int i = 3 ; i < D.length ; i++){
                if(i > n){
                    break;
                }
                D[i] = (D[i -1] + D[i-2]) % 10007;

            }
            System.out.println(D[n]);
        }
    }
}
