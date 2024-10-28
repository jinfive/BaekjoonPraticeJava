package org.example.Youtube_Jins;

import java.util.Scanner;

//문자열 뒤집기
public class Q21_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해 주세요");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int len = s.length();

        for (int i = 0; i < len/2; i++) {
            char tmp=chars[i];
            chars[i]=chars[len-i-1];
            chars[len-i-1]=tmp;
        }
        String result = new String(chars);
        System.out.println(result);

    }
}
