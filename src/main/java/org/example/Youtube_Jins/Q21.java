package org.example.Youtube_Jins;

import java.util.Scanner;
//문자열 뒤집기
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해 주세요");
        String s = sc.nextLine();

        for(int i = s.length()-1;i>=0;i--){

            System.out.print(s.charAt(i));
        }

    }
}
