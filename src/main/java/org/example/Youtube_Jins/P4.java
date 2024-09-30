package org.example.Youtube_Jins;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력해 주세요");
        int n = sc.nextInt();
        System.out.println("입력받은수 \t" +n);
    }//main
    static int twojin(int n){
        while(n>0){
            int na = n % 2;
            n=n/2;
            return na;
        }

    }
}
