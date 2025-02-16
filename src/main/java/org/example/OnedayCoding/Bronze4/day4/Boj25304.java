package org.example.OnedayCoding.Bronze4.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += (a * b);
        }
        if (sum == total) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        br.close();

//        Scanner sc = new Scanner(System.in);
//        int total = sc.nextInt();
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            sum += a * b;
//
//        }
//        if (sum == total) {
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }
//        sc.close();
    }
}
