package org.example.OnedayCoding.Bronze3.Day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int[] arr = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            StringTokenizer st  = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            total =total+ (b- a);
            arr[i] = total;
        }
        Arrays.sort(arr);
        System.out.println(arr[4-1]);



    }
}
