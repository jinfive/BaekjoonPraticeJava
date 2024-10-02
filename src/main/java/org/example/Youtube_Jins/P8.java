package org.example.Youtube_Jins;

import java.util.Scanner;
//팩토리얼 구하기
public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요>>>");
        int n = sc.nextInt();

        int f = 1;
        for (int i = 1; i <=n ; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
}
