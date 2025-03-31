package org.example.OnedayCoding.Bronze3.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1 ; i <= n + 1 ; i++){
            for (int j = 0 ; j <n+i-1 ; j++){
                if((i + j +n) % 2 == 0 && j >= n - i -1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
