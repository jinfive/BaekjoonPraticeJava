package org.example.OnedayCoding.Bronze4.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int suma = 0;
        int sumb = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {

          int a = Integer.parseInt(st.nextToken());
          suma += a;

        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {

           int b = Integer.parseInt(st2.nextToken());
           sumb += b;
        }
        if (sumb > suma) {
            System.out.println(sumb);
        } else if (sumb < suma) {
            System.out.println(suma);

        }
        else {
            System.out.println(suma);
        }
        br.close();
    }
}
