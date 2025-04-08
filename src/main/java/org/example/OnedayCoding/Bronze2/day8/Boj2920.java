package org.example.OnedayCoding.Bronze2.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2920 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[9];
        for (int i = 1; i < 9; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        if (arr[1] == 1) {
            for (int i = 1; i < 9; i++) {
                if (arr[i] == i) {
                    count++;
                }
            }
            if (count == 8) {
                System.out.println("ascending");
            } else {
                System.out.println("mixed");
            }
        } else if (arr[1] == 8) {
            for (int i = 1; i < 9; i++) {
                if (arr[i] == 9 - i) {
                    count++;
                }
            }
            if (count == 8) {
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        } else {
            System.out.println("mixed");
        }
    }
}
