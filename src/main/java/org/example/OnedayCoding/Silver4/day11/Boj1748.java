package org.example.OnedayCoding.Silver4.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1748 {


    // The main method must be in a class named "Main".
    class Main {
        //한자리수 9 개
        //두자리수 90 개
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            int s = 1;
            int m = n;
            int sum = 0;
            for(int i = 10 ; i <= n ; i *= 10){// 10일 때는 2 더해주고 100일때는 3
                sum = sum + (i - (i / 10)) * s++;
                m -= (i - (i / 10));
            }
            sum += (m * s);
            System.out.println(sum);
        }
    }
}
