package org.example.OnedayCoding.Silver5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11931 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr= new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] =  Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);


            StringBuilder sb = new StringBuilder();
            for(int i = n -1 ; i >= 0 ; i--){
                sb.append(arr[i] +"\n");
            }
            System.out.println(sb.toString());
        }
    }
}
