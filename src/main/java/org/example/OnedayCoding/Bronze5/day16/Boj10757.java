package org.example.OnedayCoding.Bronze5.day16;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Long a = sc.nextLong();
//        Long b = sc.nextLong();
//        sc.close();
//        System.out.println(a+b);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();
        System.out.println(a.add(b));

    }
}
