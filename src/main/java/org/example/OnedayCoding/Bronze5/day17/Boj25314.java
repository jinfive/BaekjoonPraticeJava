package org.example.OnedayCoding.Bronze5.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boj25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);
//        String[] str = input.split(" ");
//        System.out.println((str.length-1)*4);
        int N = Integer.parseInt(br.readLine());
        //System.out.println(N);
        for (int i = N; i > 0; i=i-4) {
            System.out.print("long ");
        }
        System.out.print("int");
        br.close();

    }
}
