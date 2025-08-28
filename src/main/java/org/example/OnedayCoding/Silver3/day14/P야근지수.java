package org.example.OnedayCoding.Silver3.day14;

import java.util.PriorityQueue;

public class P야근지수 {


    class Solution {
        private static PriorityQueue <Integer> pq;
        public long solution(int n, int[] works) {
            long answer = 0;
            pq = new PriorityQueue<>((o1, o2) -> {
                return o2 - o1;
            });
            for(int i = 0 ; i < works.length ; i++){
                pq.add(works[i]);
            }
            while(!pq.isEmpty() && n != 0){
                int num = pq.poll();
                if(num > 0){
                    num--;
                    n--;
                }
                if(num != 0){
                    pq.add(num);
                }
            }
            if(pq.isEmpty() && n >= 0 ){
                return 0;
            }
            while(!pq.isEmpty()){
                answer += (long)Math.pow(pq.poll(), 2);
            }
            return answer;
        }
    }
}
