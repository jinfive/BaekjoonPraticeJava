package org.example.OnedayCoding.Bronze3.day6;

import java.util.Scanner;

public class Boj2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for (int j = 1; j < n; j++) {
                if(i>=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }//위에 5
        for (int i = n-2; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for (int j = 1; j < n; j++) {
                if(i>=j){
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        scanner.close();
    }

}