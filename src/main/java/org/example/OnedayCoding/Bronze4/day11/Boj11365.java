package org.example.OnedayCoding.Bronze4.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals("END"))break;
            char[] chars = s.toCharArray();
            for (int i = chars.length -1; i >=0 ; i--){
                System.out.print(chars[i]);
            }
            System.out.println();
        }
        br.close();
    }
}
