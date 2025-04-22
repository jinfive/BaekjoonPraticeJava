package org.example.OnedayCoding.Bronze2.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1159 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<Character,Integer> hash;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String answer ="";

            hash = new HashMap<>();
            for(int i = 0 ; i < n ;i++){
                String name =br.readLine();
                char firstName = name.charAt(0);
                if(!hash.containsKey(firstName)){
                    hash.put(firstName,hash.getOrDefault(firstName,0)+ 1);
                }
                else{
                    hash.put(firstName,hash.getOrDefault(firstName,0) + 1);
                }

            }
            for(Map.Entry<Character,Integer> et : hash.entrySet()){
                if(et.getValue() >=5){
                    answer += et.getKey();
                }
            }
            if(answer !=""){System.out.println(answer);}
            else{System.out.println("PREDAJA");}


        }
    }

}
