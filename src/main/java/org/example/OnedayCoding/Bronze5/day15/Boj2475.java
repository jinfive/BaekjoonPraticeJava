package org.example.OnedayCoding.Bronze5.day15;

import java.util.Scanner;

public class Boj2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int a = scanner.nextInt();
            sum += a*a;
        }
        scanner.close();
        System.out.println(sum%10);
    }
}
