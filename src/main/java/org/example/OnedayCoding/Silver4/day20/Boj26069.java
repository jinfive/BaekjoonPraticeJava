package org.example.OnedayCoding.Silver4.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj26069 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int answer = 0;
            Map<String, Boolean> people = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                if(!people.containsKey(p1)){
                    people.put(p1, false);
                }
                if(!people.containsKey(p2)){
                    people.put(p2, false);
                }

                if(p1.equals("ChongChong") || p2.equals("ChongChong")){
                    people.put(p1, true);
                    people.put(p2, true);
                }
                else{
                    if(people.containsKey(p1) && people.get(p1)){
                        people.put(p2, true);
                    }
                    else if(people.containsKey(p2) && people.get(p2)){
                        people.put(p1, true);
                    }

                }
            }
            for(Map.Entry<String, Boolean> et : people.entrySet()){
                if(et.getValue()){
                    answer++;
                }
                // System.out.println(et.getKey() + " " + et.getValue());
            }
            System.out.println(answer);



        }
    }
}
