package org.example.OnedayCoding.Bronze2.Day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2231 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean flag = true;
        for(int j = 1 ; j <= n ; j++){
            String str = j +"";
            int sum = j;
            for(int i = 0 ; i < str.length() ; i++ ){
                sum += (int)(str.charAt(i)-'0');
            }
            if(sum == n){
                System.out.println(j);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(0);
        }


    }
}
