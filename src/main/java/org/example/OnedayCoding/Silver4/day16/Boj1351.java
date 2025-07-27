package org.example.OnedayCoding.Silver4.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1351 {

    // The main method must be in a class named "Main".
    class Main {
        private static Map<Long, Long> myMap;
        private static long P;
        private static long Q;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            myMap = new HashMap<>();
            P = Long.parseLong(st.nextToken());
            Q = Long.parseLong(st.nextToken());
            System.out.println(find(N));

        }
        private static Long find(long num){
            if(num == 0){
                return 1l;
            }
            if(myMap.containsKey(num)){
                return myMap.get(num);
            }
            long result = 0;
            result = find(num / P) + find(num / Q);
            myMap.put(num, result);
            return result;
        }
    }
}
