package org.example.OnedayCoding.Bronze2.day1;

import java.util.*;
import java.io.*;
import java.lang.*;

// The main method must be in a class named "Main".
public class Boj11720 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        //System.out.println(n);


        String s = br.readLine();
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            int a = s.charAt(i) - '0';
            sum += a;
        }
        System.out.println(sum);
    }
}