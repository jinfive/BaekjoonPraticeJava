package org.example.Youtube_Jins;

import java.util.Arrays;
import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요");
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]); // String을 int로 변환
        }//for

        Arrays.sort(arr);
        int arr1[] = new int[arr[arr.length-1]];
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j <arr.length; j++) {
               if (arr[j] == i) {
                   arr1[i-1]++;
               }
           }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                System.out.print(i+1 + " ");
            }
        }
        //System.out.println(Arrays.toString(arr));


    }//main
}
