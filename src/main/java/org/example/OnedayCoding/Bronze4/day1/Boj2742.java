package org.example.OnedayCoding.Bronze4.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2742 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        br.close();
    }

}
