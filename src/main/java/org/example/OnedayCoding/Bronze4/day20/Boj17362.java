package org.example.OnedayCoding.Bronze4.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1     2   3   4   5
//9     8   7   6
//      10  11  12  13
//17    16  15  14

public class Boj17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        switch (n % 8) {
            case 1:
                System.out.println(1);
                break;
            case 2, 0:
                System.out.println(2);
                break;
            case 3, 7:
                System.out.println(3);
                break;
            case 4, 6:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
        }
        br.close();

    }
}
