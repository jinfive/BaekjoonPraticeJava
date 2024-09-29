package org.example.Youtube_Jins;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int n = sc.nextInt();
//        if(n == 1 || n == 2) {
//            System.out.println("1");
//            System.exit(0);
//        }
//        int[] arr = new int[n];
//        arr[0] = 1;
//        arr[1] = 1;
//        for(int i = 2; i < n; i++) {
//            arr[i] = arr[i-1] + arr[i-2];
//        }//for
//        for(int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }//for
        //2번째 방법

        int prevnum=1;
        int pprevnum=1;
        int nnum = 0;
        for(int i = 2; i < n; i++) {
            nnum = prevnum + pprevnum;
            pprevnum = prevnum;
            prevnum = nnum;

        }
        System.out.println(nnum);
    }//main
}//class
