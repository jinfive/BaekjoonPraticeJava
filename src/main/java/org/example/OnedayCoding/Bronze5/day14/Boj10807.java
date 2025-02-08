package org.example.OnedayCoding.Bronze5.day14;

import java.util.Scanner;

public class Boj10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
