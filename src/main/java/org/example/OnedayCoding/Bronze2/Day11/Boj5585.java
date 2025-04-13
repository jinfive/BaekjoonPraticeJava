package org.example.OnedayCoding.Bronze2.Day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj5585 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 1000 - n;

        int[] arr = {500, 100, 50, 10 , 5 ,1};
        int count = 0;

        for(int coin : arr){
            if(a >= coin){
                count = count + a / coin;
                a %= coin;
            }
        }
        System.out.println(count);

    }
}
