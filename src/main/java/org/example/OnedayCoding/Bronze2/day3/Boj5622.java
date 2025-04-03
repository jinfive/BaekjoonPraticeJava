package org.example.OnedayCoding.Bronze2.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj5622 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] arr = str.toCharArray();

        String[] check = new String[8];
        check[0] = "ABC";
        check[1] = "DEF";
        check[2] = "GHI";
        check[3] = "JKL";
        check[4] = "MNO";
        check[5] = "PQRS";
        check[6] = "TUV";
        check[7] = "WXYZ";

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < check.length; j++) {
                if (check[j].contains(arr[i] + "")) {
                    sum += j + 3;
                    break;
                }
            }
        }
        System.out.println(sum);


    }
}



