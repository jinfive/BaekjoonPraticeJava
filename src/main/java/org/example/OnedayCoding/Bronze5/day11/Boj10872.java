package org.example.OnedayCoding.Bronze5.day11;

import java.util.Scanner;

public class Boj10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 1;
        if(N == 0){
            System.out.println(1);
        }
        else{
            for(int i = N; i > 0; i--){
                result *= i;
            }
            System.out.println(result);
        }
        scanner.close();
    }
}
