package org.example.OnedayCoding.Bronze1.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1373 {
    
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] arr= br.readLine().toCharArray();
            for(int i = arr.length -1 ; i >=0;){
                int temp = 0;
                for(int j = 1 ; j<= 4 && i>=0 ; j *=2 ){
                    temp += j * (arr[i--] -'0');
                }
                sb.append(temp);
            }
            System.out.println(sb.reverse());
        }
    }



}
