package org.example.Youtube_Jins;

import java.util.Scanner;

//각 자리 숫자 합 구하기 1242 >> 9
public class P9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>>>");
        int n = sc.nextInt();
        /*
        String num = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println("입력하신 숫자"+num);
        System.out.println("각 자리 숫자의 합"+sum);

         */
        int sum = 0;
        while (n>0){
            sum += n%10;
            n/=10;
        }//while
        System.out.println(sum);
        sc.close();
    }//main
}//class
