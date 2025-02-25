package org.example.OnedayCoding.Bronze4.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj11943 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();

        System.out.println(Math.min(a+d,b+c));
    }
}
