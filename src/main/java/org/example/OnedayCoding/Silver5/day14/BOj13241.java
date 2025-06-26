package org.example.OnedayCoding.Silver5.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOj13241 {


    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());  // long 사용
            long m = Long.parseLong(st.nextToken());  // long 사용

            long result = gcd(n, m);
            System.out.println(n * m / result);
        }

        private static long gcd(long a, long b){  // long 매개변수
            if(b == 0){
                return a;
            }
            return gcd(b, a % b);
        }
    }

}
