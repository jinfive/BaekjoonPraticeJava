package org.example.OnedayCoding.Silver4.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj19631 {


    // The main method must be in a class named "Main".
    class Main {


        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
            int test = Integer.parseInt(st.nextToken());
            for(int testCase = 0 ; testCase < test ; testCase++ ){
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                int[] arr = new int[num];
                for(int i = 0 ; i < num ; i++){
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                for(int j = 0; j < num ; j++){
                    for(int k = j + 1; k < num ; k++){
                        answer += GCD(arr[j], arr[k]);
                    }
                }
                System.out.println(answer);
                answer = 0;
            }


        }
        private static int GCD(int a , int b){
            if(a % b == 0){
                return b;
            }
            return GCD(b, a % b);
        }
    }
}
