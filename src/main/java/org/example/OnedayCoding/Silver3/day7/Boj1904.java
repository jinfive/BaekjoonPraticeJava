package org.example.OnedayCoding.Silver3.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1904 {


    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[] D = new int[1000001];
            D[1] = 1;
            D[2] = 2;
            for(int i = 3 ; i <= N ; i++){
                D[i] = (D[i-1] + D[i-2]);
                D[i] = D[i]  % 15746;
            }
            System.out.println(D[N]);
        }
    }

}
