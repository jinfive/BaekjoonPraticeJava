package org.example.OnedayCoding.Bronze1.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj11653 {
    
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            if(n > 1){
                for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                    while (n % i == 0) {
                        System.out.println(i);
                        n /= i;
                    }
                }
            }
            if(n> 1){
                System.out.println(n);
            }
        }
    }
}
