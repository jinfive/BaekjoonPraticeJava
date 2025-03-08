package org.example.OnedayCoding.Bronze3.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2884 {
    public static void main(String[] args) throws IOException {
        //입력 받은 시간 - 45 분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(h == 0 ){
            m = m -45;
            if(m < 0) {
                h = 23;
                m = 60 + m;
            }
            System.out.println(h + " "+m);
            System.exit(0);
        }

        m = m - 45;
        if (m < 0){
            m = 60 + m;
            h --;
        }
        System.out.println(h + " "+m);
        br.close();

    }
}
