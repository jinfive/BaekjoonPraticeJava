package org.example.OnedayCoding.Bronze2.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2231 {

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (n == check(i)) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static int check(int now) {
        int sum = now;
        char[] text = String.valueOf(now).toCharArray();
        for (int i = 0; i < text.length; i++) {
            sum += (int) (text[i] - '0');
        }
        return sum;

    }
}