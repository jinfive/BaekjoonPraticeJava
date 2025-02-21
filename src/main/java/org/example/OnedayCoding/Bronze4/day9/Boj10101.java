package org.example.OnedayCoding.Bronze4.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10101 {
    public static void main(String[] args) throws IOException {
        //세 각의 크기가 모두 60이면, Equilateral
        //세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
        //세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
        //세 각의 합이 180이 아닌 경우에는 Error
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());

        int sum = a+b+c;

        if (a == b && a == c && b == c && a ==  60){
            System.out.println("Equilateral");
        }
        else if ((sum == 180 && (a == b || a == c || b == c))){
            System.out.println("Isosceles");
        } else if ((sum == 180 && (a != b && a != c && b != c))) {
            System.out.println("Scalene");
        } else if (sum != 180) {
            System.out.println("Error");
        }
    }
}
