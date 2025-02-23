package org.example.OnedayCoding.Bronze4.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Boj1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if (s.equals("#"))break;
            char[] arr = s.toCharArray();
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'
                || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                    count++;
                }
            }
            System.out.println(count);

        }
        br.close();

    }
}
