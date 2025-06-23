package org.example.OnedayCoding.Silver5.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1094 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            while(n > 0){
                if(n % 2 == 1){
                    n--;
                    n /= 2;
                    answer++;
                }else{
                    n /= 2;
                }
            }
            System.out.println(answer);
        }
    }
}
