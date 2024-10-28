package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q23 {
    //백준1110
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요");
        int n = sc.nextInt();
        int res = n;
        int tmp = 0;
        int count = 0;
        //26 ==> 2 + 6 = 8 >68 => 6 + 8 =14 => 84 => 8 + 4 = 12 => 4 + 2 = 6 =>26
        do {
            tmp = res % 10 + res / 10;
            res = res % 10 * 10 + tmp % 10;
            count++;

        }
        while (n != res);
        System.out.println(count);


    }
}

