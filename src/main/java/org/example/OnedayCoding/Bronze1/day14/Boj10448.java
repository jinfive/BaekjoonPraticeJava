package org.example.OnedayCoding.Bronze1.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj10448 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[] T = new int[45];

            for(int i = 1 ; i < 45 ; i++){
                T[i] = i * ( i + 1) /2;
            }
            int testCase = Integer.parseInt(br.readLine());

            for(int t = 0 ; t < testCase ; t++){
                int num = Integer.parseInt(br.readLine());
                boolean flag = false;
                for(int i = 1 ; i < 45 ; i++){
                    for(int j = 1 ; j < 45 ; j++){
                        for(int k = 1 ; k < 45 ; k++){
                            if( T[i] + T[j] + T[k] == num ){
                                flag = true;

                            }
                        }
                    }
                }
                if(flag){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }

        }
    }
}
