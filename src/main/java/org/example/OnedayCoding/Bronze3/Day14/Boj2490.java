package org.example.OnedayCoding.Bronze3.Day14;

import java.io.*;
import java.util.StringTokenizer;

public class Boj2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0 ; i <3 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int countZero = 0;
            for (int j = 0 ; j < 4 ; j++){
                int n = Integer.parseInt(st.nextToken());
                if (n == 0) countZero++;
            }
            if (countZero == 4) {
                System.out.println("D");
            }
            if (countZero == 3) {
                System.out.println("C");
            }
            if (countZero == 2) {
                System.out.println("B");
            }
            if (countZero == 1) {
                System.out.println("A");
            }
            if (countZero == 0) {
                System.out.println("E");
            }
        }
    }
}
