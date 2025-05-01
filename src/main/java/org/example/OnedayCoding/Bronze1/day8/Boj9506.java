package org.example.OnedayCoding.Bronze1.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj9506 {
    // The main method must be in a class named "Main".
    class Main {
        private static List<Integer> A;
        public static void main(String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                int num = Integer.parseInt(br.readLine());
                if(num == -1) break;
                A = new ArrayList<>();
                for(int i = 1 ; i <= (num/2) ; i++ ){
                    if(num % i == 0){
                        A.add(i);
                    }
                }

                int sum = 0;
                for(int a: A){
                    sum += a;
                }
                if(sum == num){
                    System.out.print(num +" = ");
                    for(int i = 0 ; i < A.size() ;i++ ){
                        if(i == A.size() -1){
                            System.out.print(A.get(i));
                        }
                        else{
                            System.out.print(A.get(i) + " + ");
                        }
                    }


                }
                else{
                    System.out.print(num);
                    System.out.print(" is NOT perfect.");
                }
                System.out.println();
            }//while
        }
    }
}
