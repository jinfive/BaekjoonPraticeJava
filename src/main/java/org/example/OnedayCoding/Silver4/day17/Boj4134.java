package org.example.OnedayCoding.Silver4.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj4134 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[][] map;
        private static int answer;
        private static Deque<Integer> dq;
        private static int count = 0;
        private static boolean[][] visited;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int test = Integer.parseInt(st.nextToken());
            for(int testCase = 0 ; testCase < test ; testCase++){
                Long num = Long.parseLong(br.readLine());
                while(true){

                    if(isPrime(num)){
                        System.out.println(num);
                        break;
                    }
                    num++;
                }
            }
            //System.out.println(Math.sqrt(10));

        }
        private static boolean isPrime(Long num){

            if(num < 2){
                return false;
            }
            for(long i = 2 ; i <= Math.sqrt(num) ; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

}
