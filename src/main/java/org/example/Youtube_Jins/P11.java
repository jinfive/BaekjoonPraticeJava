package org.example.Youtube_Jins;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {//숫자 사각형 2
        System.out.print("숫자를 입력하세요>>>");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int[][] arr = new int[n][n];

        /*
        1   2   3
        6   5   4
        7   8   9
         */

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = i * n + j + 1;
                }//for
            }//짝수 일때
            else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = i * n + n - j;
                }//for
                System.out.println();
            }//홀수 일떄
        }//for i
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }//main
}//class
