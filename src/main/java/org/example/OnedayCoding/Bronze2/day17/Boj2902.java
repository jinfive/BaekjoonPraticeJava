package org.example.OnedayCoding.Bronze2.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2902 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] arr = str.split("-");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].charAt(0));
        }
        System.out.println(sb.toString());
    }
}


