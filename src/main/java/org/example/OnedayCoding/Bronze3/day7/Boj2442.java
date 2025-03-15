package org.example.OnedayCoding.Bronze3.day7;

import java.util.Scanner;

public class Boj2442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j >= 0; j--) {
                if (i >= j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            for(int j = 1; j < N; j++) {
                if(j<=i){
                    System.out.print("*");
                }
            }


            System.out.println();
        }
    }
}
