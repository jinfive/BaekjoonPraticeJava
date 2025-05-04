package org.example.OnedayCoding.Bronze1.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1157 {

    // The main method must be in a class named "Main".
    class Main {
        private static Map<Character ,Integer> hash;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine().toLowerCase();
            //System.out.println(str);

            hash = new HashMap<>();

            char [] cArr = str.toCharArray();
            for(char c :cArr){
                hash.put(c, hash.getOrDefault(c, 0) +1);
            }
            String answer = "";
            List<Integer> myList = new ArrayList<>(hash.values());
            int n = Collections.max(myList);
            //System.out.println(n);
            for(Map.Entry<Character ,Integer> et : hash.entrySet()){
                if(et.getValue() == n){
                    answer +=et.getKey();
                }
            }

            if(answer.length() > 1){
                System.out.println("?");
            }
            else{
                System.out.println(answer.toUpperCase());
            }

        }
    }
}
