package org.example.OnedayCoding.Bronze1.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2869 {
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            // int now = 0;
            // int count = 0;

            // while(v > now){
            //     now += a;
            //     count++;
            //     if(now >= v){
            //         break;
            //     }
            //     now -= b;
            // }

            // System.out.println(count);
            int c= a -b;
            int day = (v-b)/c;
            if((v-b)%c!= 0 ) day++;

            System.out.println(day);


        }
    }
}
