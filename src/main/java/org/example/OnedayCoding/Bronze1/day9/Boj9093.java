package org.example.OnedayCoding.Bronze1.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj9093 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());

            for(int i = 0 ; i < testCase ; i++){
                StringBuilder sb = new StringBuilder();
                String str = br.readLine();
                String[] sArr = str.split(" ");
                for(int j = 0 ; j<sArr.length ;j++ ){
                    for(int k = sArr[j].length()-1 ; k >= 0;k--){
                        sb.append(sArr[j].charAt(k));
                    }
                    sb.append(" ");
                }
                System.out.println(sb.toString());

            }

        }
    }
}
