package org.example.OnedayCoding.Bronze5.day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println(a / b);
        sc.close();

        //float VS double
        //float ==> 소수점 6,7자리
        //doyble ==>소수점 15 자리
        //어지간한 코테에서는 float보다 Double를 쓰자
    }
}
