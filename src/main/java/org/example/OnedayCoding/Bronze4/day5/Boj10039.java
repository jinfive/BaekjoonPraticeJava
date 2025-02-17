package org.example.OnedayCoding.Bronze4.day5;

import java.io.IOException;
import java.util.Scanner;

public class Boj10039 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n < 40){
                n =40;
            }
            count++;
            sum += n;
        }

        System.out.println(sum/count);

    }
}
