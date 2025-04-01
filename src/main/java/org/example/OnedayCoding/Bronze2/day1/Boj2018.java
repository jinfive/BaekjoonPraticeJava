package org.example.OnedayCoding.Bronze2.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2018 {
    public static void main (String[] args)  throws Exception{
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int sum = 1;
        int startIndex =1;
        int endIndex = 1;

        while(endIndex != n ){
            if(sum == n){
                count++;
                endIndex ++;
                sum += endIndex;
            }
            else if(sum > n){
                sum -= startIndex;
                startIndex++;

            }
            else if(sum < n){

                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(count);
    }
}
