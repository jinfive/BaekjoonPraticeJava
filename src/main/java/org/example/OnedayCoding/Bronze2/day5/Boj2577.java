package org.example.OnedayCoding.Bronze2.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2577 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        //System.out.println(a +" " + b + "  "+ c );

        long sum = a * b * c;
        // System.out.println(sum);

        int[] arr = new int[10];


        while (sum > 0) {
            int temp = (int) (sum % 10);
            arr[temp]++;
            sum /= 10;
        }
        for (long i : arr) {
            System.out.println(i);
        }
    }
}

