package org.example.OnedayCoding.Silver3.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1094 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            int answer = 0;
            while(x > 0){
                if(x % 2 == 1){
                    answer++;
                    x /= 2;
                }
                else{
                    x /= 2;
                }
            }
            System.out.println(answer);
        }
    }
}
