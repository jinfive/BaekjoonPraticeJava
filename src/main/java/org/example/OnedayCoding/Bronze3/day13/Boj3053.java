package org.example.OnedayCoding.Bronze3.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double n  = Integer.parseInt(reader.readLine());
        System.out.println(n * n  * Math.PI);
        System.out.println(2*Math.pow(n,2));

    }
}
