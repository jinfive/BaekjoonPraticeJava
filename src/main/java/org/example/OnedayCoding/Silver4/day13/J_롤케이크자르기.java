package org.example.OnedayCoding.Silver4.day13;

import java.util.HashSet;
import java.util.Set;

public class J_롤케이크자르기 {

    class Solution {
        public int solution(int[] topping) {
            int answer = 0;
            int[] me = new int[topping.length];
            int[] bro = new int[topping.length];
            Set<Integer> mySet = new HashSet<>();
            for(int i = 0 ; i < topping.length ; i++){
                mySet.add(topping[i]);
                me[i] = mySet.size();
            }
            mySet.clear();
            for(int i = topping.length - 1 ; i >= 0 ; i--){
                mySet.add(topping[i]);
                bro[i] = mySet.size();
            }

            for(int i = 0 ; i < topping.length - 1 ; i++){
                if(me[i] == bro[i + 1]){
                    answer++;
                }
            }
            return answer;
        }
    }
}
