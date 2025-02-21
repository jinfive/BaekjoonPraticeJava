package org.example.OnedayCoding.Bronze4.day9;

import java.util.Scanner;

public class Boj2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();

        int sum = l *p ;

        int [] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print((arr[i] - sum) + " ");
        }

        sc.close();
    }

}
