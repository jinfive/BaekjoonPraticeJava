package org.example.OnedayCoding.Bronze4.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int count=n-1;
        int star =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(" ");
            }//for2
            count--;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            star++;
            System.out.println();
        }//for1

    }//main
}//class
