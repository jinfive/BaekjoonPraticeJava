package org.example.OnedayCoding.Bronze3.day18;

import java.io.*;
import java.util.*;

public class Boj2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[5];
        for (int i = 0 ; i < 5 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0 ; j < 4 ; j++){
                sum += Integer.parseInt(st.nextToken());
            }
            arr[i] = sum;
        }

        int countI = 0;
        int max = 0;
        for (int i = 0 ; i < 5 ; i++){
            if (arr[i] > max){
                max = arr[i];
                countI = i+ 1;
            }
        }
        System.out.println(countI + " " + max);


    }
}
