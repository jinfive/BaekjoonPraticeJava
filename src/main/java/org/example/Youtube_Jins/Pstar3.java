package org.example.Youtube_Jins;

import java.util.Scanner;

public class Pstar3 {//별출력 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>>>");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i < n-(j+1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }//else
            }//for
            System.out.println();
        }//for
    }//mian
}//class
