package org.example.OnedayCoding.Bronze5.day3;

import java.util.Scanner;

public class Boj1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>B){
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }

    }
}
