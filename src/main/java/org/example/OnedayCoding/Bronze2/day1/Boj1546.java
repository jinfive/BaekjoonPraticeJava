package org.example.OnedayCoding.Bronze2.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1546 {


    // The main method must be in a class named "Main".
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // for (int i = 0 ; i < n ; i++){
        //     System.out.println(arr[i]);
        // }

        double sum = 100;
        // System.out.println(sum);

        for (int i = 0; i < n - 1; i++) {

            sum = sum + ((double) arr[i] / (double) arr[n - 1] * 100);
            // System.out.println(sum);
        }

        System.out.println((double) sum / n);

    }
}

