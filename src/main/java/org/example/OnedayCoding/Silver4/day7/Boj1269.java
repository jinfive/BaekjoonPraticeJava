package org.example.OnedayCoding.Silver4.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1269 {
    
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Map<Integer, Integer> A = new HashMap<>();
            Map<Integer, Integer> B = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++){
                A.put(Integer.parseInt(st.nextToken()), 1);
            }
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < M ; i++){
                B.put(Integer.parseInt(st.nextToken()), 1);
            }
            int aCount = 0;
            int bCount = 0;
            for(Map.Entry<Integer, Integer> et : A.entrySet() ){
                if(B.containsKey(et.getKey())) aCount++;
            }

            for(Map.Entry<Integer, Integer> et : B.entrySet() ){
                if(A.containsKey(et.getKey())) bCount++;
            }
            System.out.println((N - aCount) + (M - bCount));

        }
    }
}
