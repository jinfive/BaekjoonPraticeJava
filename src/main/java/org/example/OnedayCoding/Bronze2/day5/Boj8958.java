package org.example.OnedayCoding.Bronze2.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj8958 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] arr = (br.readLine()).toCharArray();
            int[] sum = new int[arr.length];
            if (arr[0] == 'O') {
                sum[0] = 1;
            } else {
                sum[0] = 0;
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == 'O') {
                    sum[j] = sum[j - 1] + 1;
                } else {
                    sum[j] = 0;
                }
            }
            int answer = 0;
            for (int k : sum) {
                answer += k;
            }
            System.out.println(answer);
        }

        
    }
}
