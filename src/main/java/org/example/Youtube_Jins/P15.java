package org.example.Youtube_Jins;

import java.util.Scanner;

public class P15 {//별찍기 기본
    public static void main(String[] args) {
        System.out.print("수를 입력하세요>>>");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }//for
            System.out.println();
        }//for
    }//main
}//class
