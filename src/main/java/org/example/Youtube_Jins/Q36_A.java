package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q36_A {
    /*
    입력된 수를 이진수로 변환하세요
     17
     정답: 1 0001
     17
     8 ... 1
     4 ...0
     2...0
     1...0
     */
    public static void two(int n) {
        if(n/2 == 0){
            System.out.print(n);
            return;
        }
        two(n/2);
        System.out.print(n%2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int n = sc.nextInt();
        two(n);

    }
}
