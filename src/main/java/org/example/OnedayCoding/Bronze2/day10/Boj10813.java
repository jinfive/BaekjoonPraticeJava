package org.example.OnedayCoding.Bronze2.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10813 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bucket = new int[n + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp = bucket[a];
            bucket[a] = bucket[b];
            bucket[b] = temp;

        }
        for (int i = 1; i < bucket.length; i++) {
            System.out.print(bucket[i] + " ");
        }

    }
}

