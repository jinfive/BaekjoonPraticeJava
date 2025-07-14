package org.example.OnedayCoding.Silver4.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj10816 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int myCard = Integer.parseInt(st.nextToken());
            Map<Integer, Integer> myMap = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < myCard ; i++){
                int num = Integer.parseInt(st.nextToken());
                myMap.put(num , myMap.getOrDefault(num, 0) + 1);
            }
            st = new StringTokenizer(br.readLine());
            int yourCard = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i< yourCard ; i++){
                int now =  Integer.parseInt(st.nextToken());
                if(myMap.containsKey(now)){
                    sb.append(myMap.get(now)+" ");
                }else{
                    sb.append(0+" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
