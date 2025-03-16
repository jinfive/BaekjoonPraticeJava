package org.example.OnedayCoding.Bronze3.Day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String s= reader.readLine();
            String[] arr = s.split(",");
            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        }
    }
}
