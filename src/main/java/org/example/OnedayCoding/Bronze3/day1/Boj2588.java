package org.example.OnedayCoding.Bronze3.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[3];
        arr1[0] = n2 % 10;
        arr1[1] = (n2 % 100)/10;
        arr1[2] = n2 / 100;
        //System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
        int s1 = arr1[0] * n1;
        int s2 = (arr1[1] * n1)*10;
        int s3 = (arr1[2] * n1)*100;
        int sum = s1 + s2 + s3;
        System.out.println(s1);
        System.out.println(s2 / 10);
        System.out.println(s3 / 100);
        System.out.println(sum);
        br.close();

    }
}
