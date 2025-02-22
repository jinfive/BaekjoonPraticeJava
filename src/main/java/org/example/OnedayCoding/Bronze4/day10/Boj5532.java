package org.example.OnedayCoding.Bronze4.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int korean =  a / c;
        int math = b / d;

        if (a % c > 0) {korean++;}
        if (b % d > 0) {math++;}

        if (korean > math) {
            System.out.println(l-korean);
        } else if (math > korean) {
            System.out.println(l - math);
        }
        else {
            System.out.println(l-math);
        }
    }
}
