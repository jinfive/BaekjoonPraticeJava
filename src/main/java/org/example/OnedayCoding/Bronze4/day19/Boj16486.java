package org.example.OnedayCoding.Bronze4.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj16486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long d1 = Long.parseLong(br.readLine());
        Long d2 = Long.parseLong(br.readLine());

        System.out.println(2 * d1 + ((2 * d2) * 3.141592));


    }
}
