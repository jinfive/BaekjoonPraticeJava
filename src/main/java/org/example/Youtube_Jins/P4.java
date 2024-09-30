package org.example.Youtube_Jins;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력해 주세요");
        int n = sc.nextInt();
        System.out.println("입력받은수 \t" +n);

        int mok =n;
        int index = 0;
        int[] arr = new int[100];
        while (mok > 0) {
            arr[index] = mok % 2;
            mok = mok / 2;
            index++;
        }


        for(int x=index-1;x>=0;x--){
            System.out.print(arr[x]);
        }
        sc.close();
    }//main

}
