package org.example.OnedayCoding.Bronze3.Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj2914 {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(N * (M-1)+1);
    }
}
