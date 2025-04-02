package org.example.OnedayCoding.Bronze2.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //System.out.println(N +" " + M);
        int[] arr = new int[N];
        int[] sum = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
            //System.out.println(arr[i]);
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i - 1] + arr[i];
            }
            //System.out.println(sum[i]);

        }


        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if (i == j) {
                System.out.println(arr[i - 1]);
            } else if (i == 1) {
                System.out.println(sum[j - 1]);
            } else {
                System.out.println(sum[j - 1] - sum[i - 2]);
            }
        }
    }
}
