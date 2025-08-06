package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj24313 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a0 = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(br.readLine());
            int n0 = Integer.parseInt(br.readLine());

            if(a1 > c){
                System.out.println(0);
                return;
            }
            else{
                int num = c - a1;
                if(num * n0 >= a0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
        }
    }
}
