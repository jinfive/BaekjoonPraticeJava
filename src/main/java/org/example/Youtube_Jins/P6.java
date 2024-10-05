package org.example.Youtube_Jins;

import java.util.Scanner;

public class P6 { // 최대 공약수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        방법 1번
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
*/
        System.out.println("두 수를 입력하세요.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int big = a;
        int small = b;
        if (a < b) {
            big = b;
            small = a;
        }//if
        int gcd = 1 ;
        for (int i = 1; i < small; i++) {
            if (big % i == 0 && small % i == 0) {
                gcd = i;
            }//if

        }//for
        System.out.println(gcd);
    }//main
}//class
