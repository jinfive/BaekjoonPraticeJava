package org.example.OnedayCoding.Bronze3.Day16;
import java.io.*;
import java.util.*;

public class Boj2522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i>=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i>=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
