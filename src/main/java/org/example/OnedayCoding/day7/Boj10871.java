package org.example.OnedayCoding.day7;

import java.util.Scanner;

public class Boj10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sol = new int[number];

        for (int i = 0; i < number; i++) {
            if (arr[i] < x) {
                sol[i] = arr[i];
                System.out.print(sol[i] + " ");
            }
        }

    }
}
