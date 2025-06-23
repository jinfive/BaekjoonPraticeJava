package org.example.OnedayCoding.Silver5.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1789 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Long num = Long.parseLong(br.readLine());
            Long sum = 0L;
            int max = 1;

            while(sum + max <= num){
                sum += max;
                max++;
            }

            System.out.println(max - 1);
        }
    }
}
