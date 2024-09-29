package org.example.Youtube_Jins;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        System.out.println("숫자의 길이를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("문자를 한줄에 입력하세요");
        sc.nextLine();
        String number = sc.nextLine();
        String[] str = number.split(" ");
        int[] num = new int[str.length];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str[i]);
        }

        int[] mode = new int[n+1];

        for(int c:num){
            mode[c]++;
        }//for

        int maxCount = 0;  //최빈수
        int maxModeValue = 0; // 최빈수 정수

        // 최빈수 찾기
        for (int i = 1; i <= n; i++) {
            if (mode[i] > maxCount) {
                maxCount = mode[i];
                maxModeValue = i; // 최빈수의 값 저장
            }
        }

        System.out.println("최빈수는 >>> " + maxModeValue);
        sc.close(); // Scanner 자원 해제


    }//main
}//class
