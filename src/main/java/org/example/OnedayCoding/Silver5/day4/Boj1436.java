package org.example.OnedayCoding.Silver5.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1436 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            int index = 666;
            while(n > cnt){
                String temp = index +"";
                if(temp.contains("666")){
                    cnt++;

                }
                index++;
            }
            index--;
            System.out.println(index);
        }
    }
}
