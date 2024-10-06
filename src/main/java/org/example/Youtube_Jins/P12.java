package org.example.Youtube_Jins;

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = ++count;
            }//for
        }//for

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }//main
}//class
