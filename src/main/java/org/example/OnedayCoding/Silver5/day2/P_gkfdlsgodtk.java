package org.example.OnedayCoding.Silver5.day2;

import java.util.HashMap;
import java.util.Map;

public class P_gkfdlsgodtk {
    
    class Solution {
        private static Map<String,Integer> wantMap;
        private static int answer = 0;
        public int solution(String[] want, int[] number, String[] discount) {
            wantMap = new HashMap<>();

            for(int i = 0; i < want.length; i++){
                wantMap.put(want[i], number[i]);
            }
            int deadLine = discount.length - 10;

            for(int i = 0 ; i <= deadLine ; i++){
                Map <String,Integer> cpWantMap = new HashMap<>(wantMap);
                for(int j = i ; j < i +10 ; j++){
                    if(cpWantMap.containsKey(discount[j])){
                        if(cpWantMap.get(discount[j]) > 0){

                            cpWantMap.put(discount[j], cpWantMap.getOrDefault(discount[j],0) - 1);
                        }
                    }
                }
                boolean flag = true;
                for(Map.Entry<String,Integer> et : cpWantMap.entrySet()){
                    if(et.getValue() > 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }

            return answer;
        }
    }
}
