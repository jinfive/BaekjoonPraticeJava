package org.example.OnedayCoding.Silver4.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1351 {

    class Main {
        private static Map<Long, Long> myMap;
        private static long n;
        private static long p;
        private static long q;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 안전한 파싱
            n = Long.parseLong(st.nextToken());
            p = Long.parseLong(st.nextToken());
            q = Long.parseLong(st.nextToken());

            myMap = new HashMap<>();
            long answer = solve(n);

            System.out.println(answer);
        }

        private static long solve(long num){
            if(num == 0) return 1;

            if(myMap.containsKey(num)){
                return myMap.get(num);
            }

            long result = solve(num/p) + solve(num/q);
            myMap.put(num, result);

            return result;
        }
    }

}
