package org.example.OnedayCoding.Bronze3.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
       for (int i = 1; i <= s.length(); i++) {
           System.out.print(s.charAt(i-1));
           if(i%10 ==0){
               System.out.println();
           }
       }

    }
}
