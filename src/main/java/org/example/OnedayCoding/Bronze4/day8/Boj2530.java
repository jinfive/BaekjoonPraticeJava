package org.example.OnedayCoding.Bronze4.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int sec = Integer.parseInt(br.readLine());

        //60 초 1 분 3600 1시간


        s += sec;
        if(s>59){
            m+=s/60;
            s= s%60;
        }
        if (m>59){
            h+=m/60;
            m = m%60;
        }
        if(h>23){
            h = h%24;
        }
        System.out.println(h+" "+m+" "+s);
        br.close();



    }
}
