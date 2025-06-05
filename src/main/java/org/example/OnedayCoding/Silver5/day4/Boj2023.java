package org.example.OnedayCoding.Silver5.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2023 {


    // The main method must be in a class named "Main".
    class Main {
        private static int N;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            N = n;
            find(2, 1);
            find(3, 1);
            find(5, 1);
            find(7, 1);

        }
        private static void find(int num, int dept){
            if(dept == N){//종료 조건
                if(isVal(num)){
                    System.out.println(num);
                }
                return;
            }
            for(int i = 1 ; i < 10 ; i++){
                if(i % 2 == 0) continue;
                if(isVal(num*10 + i)){
                    find(num*10 + i, dept+1);
                }
            }
        }
        private static boolean isVal(int num){
            for(int i = 2 ; i < num /2 ; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
