package org.example.OnedayCoding.Bronze4.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 =  Integer.parseInt(st.nextToken());
        int s =  Integer.parseInt(st.nextToken());




        System.out.println((2*s) - R1);
        br.close();

    }

}
