package org.example.Youtube_Jins;

import java.util.Scanner;

public class P7 {//소수 찾기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하여 주세요");
        int n = sc.nextInt();

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("소수가 아닙니다");
              System.exit(0);
            }
        }//for
        System.out.println(n + "는 소수 입니다.");
    }//main
}//class
