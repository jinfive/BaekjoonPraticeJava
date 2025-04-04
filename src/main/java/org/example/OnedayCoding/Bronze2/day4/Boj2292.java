package org.example.OnedayCoding.Bronze2.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2292 {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long m = Long.parseLong(br.readLine());
            long start = 1;
            long end = 1;
            int count = 1;
            int i = 1;
            while(true){
                if(m <= end){
                    System.out.println(count);
                    break;
                }
                start = end +1;
                end = end + (6 * i);
                i++;
                count++;
            
        }
    }
}
