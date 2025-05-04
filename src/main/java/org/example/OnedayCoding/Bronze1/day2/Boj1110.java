package org.example.OnedayCoding.Bronze1.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1110 {
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String oS = s;
            if(s.length() == 1){
                s = "0"+s;
                oS = s;
            }

            int count = 0;
            while(true){
                int sum = s.charAt(0)-'0' + s.charAt(1)-'0';
                int lastSum = sum %10;
                int first = s.charAt(1)-'0';
                String str = (first+"") + (lastSum+"");
                s =str;
                count++;
                if(oS.equals(str)){
                    break;
                }


            }

            System.out.println(count);
        }
    }
}
