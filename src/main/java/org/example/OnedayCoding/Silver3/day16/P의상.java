package org.example.OnedayCoding.Silver3.day16;

import java.util.HashMap;
import java.util.Map;

public class P의상 {

    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            Map<String, Integer> cloMap = new HashMap<>();
            for(int i = 0 ; i < clothes.length ; i++){
                String menu = clothes[i][1];
                String cloth = clothes[i][0];
                cloMap.put(menu, cloMap.getOrDefault(menu, 0) + 1);
            }
            for(Map.Entry <String, Integer> et : cloMap.entrySet()){
                answer *= (et.getValue() + 1);
            }
            return answer - 1;
        }
    }
}
