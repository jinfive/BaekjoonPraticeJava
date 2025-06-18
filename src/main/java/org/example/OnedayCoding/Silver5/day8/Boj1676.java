package org.example.OnedayCoding.Silver5.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1676 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            for(int i = 5 ;  i <= n ;i++){
                int now = i;
                while(now % 5 == 0){
                    answer++;
                    now /= 5;
                }
            }
            System.out.println(answer);
        }
    }
}
