package org.example.OnedayCoding.Bronze4.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(br.readLine());
            for (int j = 1; j <= a; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        br.close();
    }
}
