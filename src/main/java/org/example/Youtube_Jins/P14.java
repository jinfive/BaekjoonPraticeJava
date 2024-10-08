package org.example.Youtube_Jins;

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        System.out.print("시작하는 구구단 입력 끝나는 구구단 입력>>");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int s = Integer.parseInt(arr[0]);
        int f = Integer.parseInt(arr[1]);

        for (int i = s; i <= f; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +" * "+j+" = " + (i*j));
            }//for
            System.out.println("================        "+i+"단       ==================");
        }//for
    }//main
}//class
