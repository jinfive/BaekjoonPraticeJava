package org.example.OnedayCoding.Bronze2.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj10996 {


    // The main method must be in a class named "Main".

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            if(n == 1){
                System.out.print("*");
            }
            else{
                for(int i = 1 ; i <= 2*n ; i ++){
                    for(int j = 1 ; j<= n ; j++){
                        if((i + j) % 2  == 0 ){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }

    }
}
