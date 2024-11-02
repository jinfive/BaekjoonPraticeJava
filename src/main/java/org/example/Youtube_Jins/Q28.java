package org.example.Youtube_Jins;

import java.util.Arrays;
import java.util.Scanner;

public class Q28 {
    //진수변환 입력받은 10 진수를 n진수로 바꿔라
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("변환 할 수 를 입력하세요");
        int n = sc.nextInt();
        System.out.println("진수를 입력하세요");
        int s = sc.nextInt();

        char[] chars = new char[32];
        int i = 0;

        while (n > 0) {
            int tmp = n % s;
            if (tmp >= 10) {
                chars[i] = (char) ('A' + (tmp - 10));
            } else {
                chars[i] = (char) ('0' + tmp);
            }
            n /= s;
            i++;
        }//while
        for (i = i - 1; i >= 0; i--) {
            System.out.print(chars[i]); // 올바른 순서로 출력
        }

    }
}
