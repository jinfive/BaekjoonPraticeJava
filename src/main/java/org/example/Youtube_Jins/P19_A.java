package org.example.Youtube_Jins;

import java.util.Scanner;

public class P19_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요");
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int[] arr = new int[101];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]); // String을 int로 변환
        }//for
        boolean[] arr1 = new boolean[101];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[arr[i]] = true;
        }
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i]) {
                System.out.print(i + "  ");
            }
        }
    }
}
