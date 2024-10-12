package org.example.Youtube_Jins;

import java.util.Scanner;

public class P16 {//별찍기 2
    public static void main(String[] args) {
        System.out.print("수를 입력하세요>>>");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = n; j > i; j--) {
                System.out.print("*");

            }//for
            System.out.println();
        }//for
    }//main
}//class
