package org.example.Youtube_Jins;

import java.util.Scanner;

//백준 4344 평균은 넘겠지
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
            sum += arr[i];
        }
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (avg < arr[i]) {
                count++;
            }
        }//for
        System.out.println("평균이상의 비율");
        System.out.println(sum/(double)arr.length );
    }
}
