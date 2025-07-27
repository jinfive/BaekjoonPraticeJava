package org.example.OnedayCoding.Silver4.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj18110 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            //System.out.println(Math.ceil(12.3));올림
            //System.out.println(Math.round(12.3));반올림
            //System.out.println(Math.round(12.5));
            //System.out.println(Math.floor(12.3));//내림
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int[] people = new int[num];
            int del = (int)Math.round((double)num - ((double)num * 0.85));

            for(int i = 0 ; i < num ; i++){
                people[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(people);
            double sum = 0;
            int count = 0;
            for(int i= del ; i < num - del ; i++){
                sum += people[i];
                count++;
            }

            System.out.println(Math.round(sum / count));

        }
    }
}
