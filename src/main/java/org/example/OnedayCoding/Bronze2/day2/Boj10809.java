package org.example.OnedayCoding.Bronze2.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj10809 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        // System.out.print((int)'a'); 97
        // System.out.print((int)'z'); 122 총 26가지 숫자
        String s = br.readLine();
        int[] arr = new int [26];
        for(int i = 0 ; i < 26 ; i++){
            arr[i] = -1;
        }
        for(int i = 0 ; i < s.length() ; i++){
            int a = (int)s.charAt(i);
            if(arr[a - 97] == -1 ){arr[a - 97] = i;}

        }
        for(int i = 0 ; i < 26 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
