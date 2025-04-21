package org.example.OnedayCoding.Bronze2.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj7567 {
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int h = 10;
            for(int i = 1 ; i < str.length() ; i++){
                if(str.charAt(i) == str.charAt(i-1)){
                    h += 5;
                }
                else{
                    h+= 10;
                }
            }
            System.out.println(h);
        }
    }
}
