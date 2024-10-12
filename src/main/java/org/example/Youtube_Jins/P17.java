package org.example.Youtube_Jins;

import java.util.Scanner;

public class P17 {//거듭제곱 연습

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("거듭제곱 할 수를 입력하세요");
        int a = sc.nextInt();
        System.out.println("몇번 거듭제곱 할건지 작성해주세요");
        int b = sc.nextInt();
        int hap = 1;
        for (int i = 0; i < b; i++) {
            hap *= a;
        }
        System.out.println();
        System.out.println("거듭제곱 결과는>>>>>"+hap);
        sc.close();
    }//main
}//class
