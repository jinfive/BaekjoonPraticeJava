package org.example.OnedayCoding.Bronze1.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2023 {

    private static int n = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    private static void DFS(int num, int depth) {
        if (depth == n) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            return;
        } else if (isPrime(num)) {
            for (int i = 1; i <= 9; i++) {
                DFS(num * 10 + i, depth + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
