package org.example.OnedayCoding.Bronze3.Day15;

import java.io.*;

public class Boj10162 {
    public static void main(String[] args) throws IOException {
        //A 5분 B 1분 C10초
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a = 300;
        int b = 60;
        int c = 10;
        int ta = 0;
        int tb = 0;
        int tc = 0;

        if(t >= a){
            ta = t / a;
            t = t % a;

        }
        if(t >= b){
            tb = t / b;
            t = t % b;

        }
        if(t >= c){
            tc = t / c;
            t = t % c;

        }
        if(t % c != 0){
            System.out.println(-1);
        }
        else{
            System.out.println(ta +" "+tb+" "+tc);
        }
        br.close();
    }

}
