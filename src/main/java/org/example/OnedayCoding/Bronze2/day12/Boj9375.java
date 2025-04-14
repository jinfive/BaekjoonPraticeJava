package org.example.OnedayCoding.Bronze2.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj9375 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(br.readLine());
        for(int tc = 0 ; tc < t ; tc++){
            Map<String , Integer> hash = new HashMap<>();

            int n = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < n ;i++){
                String str = br.readLine();
                String[] arr = str.split(" ");
                hash.put(arr[1],hash.getOrDefault(arr[1],0)+1);
            }

            int answer =1 ;
            for(int a : hash.values()){
                answer *= (a+1);
            }
            System.out.println(answer-1);

        }

    }
}
