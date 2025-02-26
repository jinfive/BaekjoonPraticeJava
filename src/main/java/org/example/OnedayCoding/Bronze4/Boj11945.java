package org.example.OnedayCoding.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            int[] arr = new int[M];
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[j] = Integer.parseInt(s.charAt(j) + "");
            }
            for (int j = M-1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
