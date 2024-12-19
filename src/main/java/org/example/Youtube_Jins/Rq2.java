package org.example.Youtube_Jins;

import java.util.Scanner;

public class Rq2 {
    //피보나치 수열 출력 1 1 2 3 5 8 13 ....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }//for
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }//main
}//class
