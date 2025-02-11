package org.example.OnedayCoding.Bronze5.Day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long N = Long.valueOf((st.nextToken()));
        Long M = (long) Integer.parseInt(st.nextToken());
        System.out.println(Math.abs(N-M));
        br.close();
        //System.out.println(Math.abs(a - b));
    }
}
