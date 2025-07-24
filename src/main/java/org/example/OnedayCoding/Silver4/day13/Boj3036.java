package org.example.OnedayCoding.Silver4.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3036 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int ring = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int standard = Integer.parseInt(st.nextToken());
            for(int i = 1 ; i < ring ; i++){
                int num = Integer.parseInt(st.nextToken());
                int na = gcd(standard, num);
                sb.append(standard/na +"/" + num/na +"\n");
            }
            System.out.println(sb.toString());
        }
        private static int gcd(int a, int b){
            if(a % b == 0){
                return b;
            }
            return gcd(b, a % b);
        }
    }
}
