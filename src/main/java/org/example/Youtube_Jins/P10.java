package org.example.Youtube_Jins;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        //입력된 n만큼 n행 n열로 출력되는 사각형을 만들어 보세요
        Scanner sc  = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>>>");
        int n = sc.nextInt();
        int num =1 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(num+"\t");
                num++;
            }//for
            System.out.println();
        }//for
    }//main
}//class
