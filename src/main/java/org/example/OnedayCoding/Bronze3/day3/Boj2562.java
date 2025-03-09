package org.example.OnedayCoding.Bronze3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int [] sortarr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sortarr[i] = arr[i];
        }
        Arrays.sort(sortarr);
//        for (int i = 0; i < 9; i++) {
//            System.out.print(sortarr[i] + " ");
//        }3 12 29 38 40 57 61 74 85
        System.out.println(sortarr[8]);
        for (int i = 0; i < 9; i++) {
            if (arr[i] == sortarr[8]) {
                System.out.println(i+1);
            }
        }

    }
}
