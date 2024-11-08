package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q36 {
    /*
    입력된 수를 이진수로 변환하세요
     17
     정답: 1 0001
     */
    public static  void two(int n){
        while(n>0){
            System.out.print(n%2);
            n=n/2;
            two(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int n = sc.nextInt();
        two(n);

    }
}
