package org.example.OnedayCoding.Bronze3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int s = Integer.parseInt(br.readLine());

        int nh = 0;
        int nm = 0;
        if(s>=60){
            nh = s / 60;
            nm = s % 60;
            h = h+nh;
            m = m+nm;
        }
        else{
            m = m + s;
        }


        if(m >= 60){
            m -= 60;
            h++;
            if(h >= 24){
                h -= 24;
            }
        }
        else if(h >= 24){
            h -= 24;
        }
        System.out.println(h +" "+ m);
        br.close();
    }
}
