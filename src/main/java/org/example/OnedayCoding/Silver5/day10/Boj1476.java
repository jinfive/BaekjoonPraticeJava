package org.example.OnedayCoding.Silver5.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1476 {



    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken());//15
            int s = Integer.parseInt(st.nextToken());//28
            int m = Integer.parseInt(st.nextToken());//19
            if(e == 15) e = 0;
            if(s == 28) s = 0;
            if(m == 19) m = 0;


            int count = 1;
            while(true){
                if(count % 15 == e && count % 28 == s && count % 19 == m  ){

                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
