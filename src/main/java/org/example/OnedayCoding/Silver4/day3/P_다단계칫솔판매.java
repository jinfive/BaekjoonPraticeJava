package org.example.OnedayCoding.Silver4.day3;

import java.util.HashMap;
import java.util.Map;

public class P_다단계칫솔판매 {


    class Solution {
        private static Map<String, String> enrollMap;
        private static Map<String, Integer> answerMap;
        private static int[] answer;

        public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
            enrollMap = new HashMap<>();
            answerMap = new HashMap<>();
            answer = new int[enroll.length];
            for(int i = 0 ; i < enroll.length ; i++){
                String me = enroll[i];
                String parent = referral[i];
                enrollMap.put(me, parent);
                answerMap.put(me, 0);
            }
            for(int i = 0 ; i < seller.length ; i++){
                find(seller[i], amount[i] * 100);
            }
            for(int i = 0 ; i < enroll.length ; i++){
                answer[i] = answerMap.get(enroll[i]);
            }

            // System.out.println((int)11.2);
            return answer;
        }
        private static void find(String me, int cost){
            int YourCost = cost / 10;
            int myCost = cost - YourCost;

            answerMap.put(me, answerMap.getOrDefault(me, 0) + myCost);
            if(!enrollMap.get(me).equals("-") && YourCost >= 1){
                find(enrollMap.get(me), YourCost);
            }



        }
    }
}
