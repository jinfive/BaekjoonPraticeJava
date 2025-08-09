package org.example.OnedayCoding.Silver3.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bpj9095 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int test = Integer.parseInt(br.readLine());
            StringBuilder sb= new StringBuilder();
            int[] DP = new int[12];
            DP[1] = 1;
            DP[2] = 2;
            DP[3] = 4;
            for(int i = 4 ; i <= 11 ; i++){
                DP[i] = DP[i - 1] + DP[i -2] + DP[i -3];
            }
            for(int i= 0 ; i < test ; i++){
                int n = Integer.parseInt(br.readLine());
                sb.append(DP[n] + "\n");
            }
            System.out.print(sb.toString());
        }
    }
}
