package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q20 {
    //팰린드롬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 문자 열을 입력하세요>>>>");
        String s = sc.nextLine();

        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }//for
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]) {
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(true);
        sc.close();
    }//mian
}//class
