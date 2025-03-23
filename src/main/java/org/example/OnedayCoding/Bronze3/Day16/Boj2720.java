package org.example.OnedayCoding.Bronze3.Day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2720 {
    public static void main(String[] args) throws IOException {
        //쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int q = 25;
        int d = 10;
        int ni = 5;
        int p = 1;


        for (int i = 1; i <= n; i++) {
            int rq = 0;
            int rd = 0;
            int rni = 0;
            int rp = 0;
            int x = Integer.parseInt(reader.readLine());
            if(x >= 25){
                rq = x / q;
                x = x % q;
            }
            if(x >= d){
                rd = x / d;
                x = x % d;
            }
            if(x >= ni){
                rni = x / ni;
                x = x % ni;
            }
            if(x >= p){
                rp = x / p;
            }
            System.out.println(rq + " " + rd + " " + rni + " " + rp);
        }

    reader.close();
    }
}
