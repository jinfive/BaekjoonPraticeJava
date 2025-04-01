package org.example.OnedayCoding.Bronze2.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj3052 {


    // The main method must be in a class named "Main".

        public static void main (String[] args)  throws Exception{
            int[] arr = new int[10];

            boolean[] check = new boolean[43];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 0 ; i < 10 ; i++){
                arr[i] = Integer.parseInt(br.readLine());
                //System.out.println(arr[i]);
                check[arr[i] % 42] = true;
            }
            int cnt = 0;
            for(int i = 0 ; i < check.length ; i++){
                if(check[i]){
                    cnt++;
                }
            }
            System.out.print(cnt);


        }


}
