package org.example.OnedayCoding.Bronze3.Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //바구니 수
        int M = Integer.parseInt(st.nextToken()); //횟수

        int[] buckets = new int[N+1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());//몇번 바구니부터
            int b = Integer.parseInt(st1.nextToken()); //몇번 바구니까지
            int c = Integer.parseInt(st1.nextToken());//몇번 공
            for (int j = a; j <= b; j++) {
                buckets[j] = c;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(buckets[i] +" ");
        }
        br.close();
    }
}
