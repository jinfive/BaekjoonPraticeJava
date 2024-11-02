package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q29 {
    //백준 음계 2920
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int size = arr.length;

        String srt = "";

            for (int i = 0; i < size -1; i++) {
                if (arr[i]+1 == arr[i+1]) {
                    String str = "ascending";
                }
            }//for
            for (int i = 0; i < size -1; i++) {
                if (arr[i] == arr[i+1] +1 ) {
                   String str = "descending";
                }
            }//for




    }
}


