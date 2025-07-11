package org.example.OnedayCoding.Silver4.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2839 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int answer = 0;
            while(2 < num){
                if(num % 5 == 0 ){
                    num = num - 5;
                    answer++;
                    continue;
                }
                if(num % 3 == 0 ){
                    num = num - 3;
                    answer++;
                    continue;
                }
                if(num % 5 != 0 && num % 3 != 0 && num >= 5){
                    num = num - 5;
                    answer++;
                    continue;
                }
                if(num % 5 != 0 && num % 3 != 0 && num < 5 && num >= 3){
                    num = num -3;
                    answer++;
                    continue;
                }

            }
            if(num != 0 ){
                answer = -1;
            }
            System.out.println(answer);
        }
    }
}
