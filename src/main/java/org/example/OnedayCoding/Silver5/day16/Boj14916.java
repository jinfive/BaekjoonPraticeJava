package org.example.OnedayCoding.Silver5.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj14916 {

    class Main {
        public static void main(String[] args) throws Exception{
            int answer = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int coin = Integer.parseInt(br.readLine());

            while(coin > 0 && coin % 5 != 0){
                coin -= 2;
                answer++;
            }

            if(coin < 0){
                System.out.println(-1);
            } else {
                answer += coin / 5;
                System.out.println(answer);
            }
        }
    }

}
