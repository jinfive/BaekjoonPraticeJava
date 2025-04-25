package org.example.OnedayCoding.Bronze1.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2609 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int v = gcd( a , b);
            System.out.println(v);
            System.out.println((a*b)/v);

        }
        private static int gcd(int a , int  b){
            if(a % b !=0 ){
                return gcd(b , a%b);
            }
            return b;
        }
    }
}
