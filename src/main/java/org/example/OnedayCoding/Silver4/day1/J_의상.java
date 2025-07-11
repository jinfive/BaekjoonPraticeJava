package org.example.OnedayCoding.Silver4.day1;

import java.util.HashMap;
import java.util.Map;

public class J_의상 {

    class Solution {
        private static Map<String, Integer> clothMap;
        public int solution(String[][] clothes) {
            clothMap = new HashMap<>();
            int answer = 1;
            for(int i = 0 ; i < clothes.length ; i++){
                clothMap.put(clothes[i][1], clothMap.getOrDefault(clothes[i][1], 0) + 1);

            }
            for(Map.Entry<String,Integer> et : clothMap.entrySet()){
                answer *= (et.getValue() + 1);
            }

            return answer - 1;
        }
    }
}
