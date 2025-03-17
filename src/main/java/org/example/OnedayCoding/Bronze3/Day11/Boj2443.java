package org.example.OnedayCoding.Bronze3.Day11;

import java.util.Scanner;

public class Boj2443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 2*N -i; j++) {
                if(j>=i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
