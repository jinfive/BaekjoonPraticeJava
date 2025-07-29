package org.example.OnedayCoding.Silver4.day17;

import java.util.Arrays;

public class J_구명보트 {

    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            Arrays.sort(people);
            int pigPoint = people.length - 1;
            int fishPoint = 0;
            while(fishPoint <= pigPoint){
                int w = people[pigPoint];
                if(pigPoint == fishPoint){
                    answer++;
                    break;
                }
                else if(w + people[fishPoint] <= limit){
                    pigPoint--;
                    fishPoint++;
                    answer++;
                }
                else{
                    pigPoint--;
                    answer++;
                }
            }

            return answer ;
        }
    }
}
