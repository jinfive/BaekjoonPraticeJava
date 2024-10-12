package org.example.Youtube_Jins;

import java.util.Scanner;

public class P12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요>>>>");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(i * j+"\t\t");
            }//for
            System.out.println();
        }//for
    }//main
}//class
