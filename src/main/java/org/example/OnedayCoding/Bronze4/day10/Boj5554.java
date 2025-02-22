package org.example.OnedayCoding.Bronze4.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj5554 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int d = Integer.parseInt(br.readLine());

    int sum = a + b + c + d;

        System.out.println(sum/60);
        System.out.println(sum%60);
    }
}
