package org.example.OnedayCoding.Bronze4.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int star = n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }//infor
            System.out.println();
            star--;
        }//outfor
        br.close();

    }
}
