package org.example.OnedayCoding.Bronze3.day13;
import java.util.*;
import java.util.Scanner;

public class Boj2523 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("*");
                }



            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("*");
                }


            }
            System.out.println();
        }
    }
}
