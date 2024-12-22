package org.example.OnedayCoding.day1;

import java.util.Scanner;

public class BOJ1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세여 Ex)1 2");
        String input = sc.nextLine();
        String[] arr =input.split(" ");

        int[] numarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numarr[i] = Integer.parseInt(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < numarr.length; i++) {
            sum += numarr[i];
        }
        System.out.println("두수의 합은>>"+ sum);
        /*
        int A = Sc.nettInt();
        int B = Sc.nettInt();

         */
    }
}
