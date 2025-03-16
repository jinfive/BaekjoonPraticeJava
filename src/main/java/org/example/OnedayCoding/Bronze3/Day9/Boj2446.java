package org.example.OnedayCoding.Bronze3.Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for (int j = n-1; j > 0; j--) {
                if(j>i){
                    System.out.print("*");
                }
            }

            System.out.println();
        }//위
        for (int i = n-1; i >0 ; i--) {
            for (int j = 1; j <=n ; j++) {
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for (int j = 1; j <=n ; j++) {
                if(j>i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
