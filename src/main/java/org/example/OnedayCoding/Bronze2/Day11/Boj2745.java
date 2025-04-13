package org.example.OnedayCoding.Bronze2.Day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2745 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] text = (st.nextToken()).toCharArray();
        int n = Integer.parseInt(st.nextToken());
        int A[] = new int[text.length];


        for (int i = 0; i < text.length; i++) {
            if (47 < text[i] && text[i] < 58) {//숫자라면
                A[i] = (int) (text[i] - '0');
            } else {
                A[i] = (int) (text[i] - 55);
            }
            // System.out.println(A[i]);
        }

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += (Math.pow(n, i) * A[A.length - 1 - i]);
        }
        System.out.println(result);

        // 0 == 48 , A == 65 , Z == 90
    }

}
