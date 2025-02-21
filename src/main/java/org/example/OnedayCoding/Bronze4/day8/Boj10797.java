package org.example.OnedayCoding.Bronze4.day8;

import java.util.Scanner;

public class Boj10797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
