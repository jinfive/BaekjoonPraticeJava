package org.example.Youtube_Jins;

import java.util.Scanner;

public class Rq4 {
    //10진수 2진수 변환
    //ex 19 >> 10011
    //19 /2 = 9 ... 1
    //9 / 2 = 4 ... 1
    //4 /2 = 2 ... 0
    //2 / 2 = 1 ... 0
    //1 / 2 = 0 ... 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주시요>>");
        int num = sc.nextInt();
        int[] bin = new int[100];

        int i = 0;
        while (num > 0) {
            bin[i] = num % 2;
            num = num / 2;
            i++;
        }//while

        for (int j = i-1; j >=0 ; j--) {
            System.out.print(bin[j]);
        }//for
    }//main
}//class
