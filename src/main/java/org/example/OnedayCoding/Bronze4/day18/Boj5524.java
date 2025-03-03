package org.example.OnedayCoding.Bronze4.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5524 {
    public static void main(String[] args) throws IOException {
//        System.out.println((int)'a');//97
//        System.out.println((int)'z');//122
//        System.out.println((int)'A');//65
//        System.out.println((int)'Z');//90

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j]>='A' &&chars[j]<='Z') {
                    chars[j] =(char) (chars[j] + 32) ;
                    System.out.print(chars[j]);
                }
                else {
                    System.out.print(chars[j]);
                }
            }
            System.out.println();

        }
        br.close();
    }
}
