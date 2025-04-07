package org.example.OnedayCoding.Bronze2.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1712 {


    // The main method must be in a class named "Main".

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long C = Long.parseLong(st.nextToken());
        Long sum = 0l;
        Long count = 1l;
        if (B >= C) {
            System.out.println(-1);
        } else {
            System.out.println(A / (C - B) + 1);
        }


    }

}
