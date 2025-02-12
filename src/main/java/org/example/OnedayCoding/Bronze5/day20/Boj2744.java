package org.example.OnedayCoding.Bronze5.day20;

import java.util.Scanner;

public class Boj2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println('a'-'A');>>>>32
        //System.out.println((int)'A');65
        //System.out.println((int)'Z');90
        //System.out.println((int)'a');97
        //System.out.println((int)'z');122

        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >='a'){
                System.out.print((char)(c - 32));
            }
            else if(c <'a'){
                System.out.print((char)(c + 32));
            }
        }
        scanner.close();
    }
}
