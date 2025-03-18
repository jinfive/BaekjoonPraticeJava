package org.example.OnedayCoding.Bronze3.day12;

import java.util.Scanner;

public class Boj2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
               count++;
               if(count == k){
                   System.out.println(i);
                   break;
               }
            }
        }
        if(count != k){System.out.println(0);}

        scanner.close();
    }
}
