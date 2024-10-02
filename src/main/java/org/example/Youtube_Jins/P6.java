package org.example.Youtube_Jins;

import java.util.Scanner;

public class P6 { // 최대 공약수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {

            while (b > 0) {
                int r = a % b;
                a = b;
                b = r;
            }//while
            System.out.println(a);
        }//if
        else{
            while (a > 0) {
                int r = b % a;
                b = a;
                a = r;
            }//while
            System.out.println(b);
        }//else


    }
}
