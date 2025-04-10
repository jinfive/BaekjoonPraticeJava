package org.example.OnedayCoding.Bronze2.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Boj1929 {


    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];

            Arrays.sort(stages);
            int people = stages.length;

            int[] quest = new int [N+2];//스테이지에 머무는 사람

            for(int i = 0 ; i < stages.length ; i++){
                quest[stages[i]]++;
            }

            for(int i = 0 ; i < quest.length ; i++){
                System.out.println("stage"+i+">> "+quest[i]);
            }

            double[] fail = new double[N+2];

            for(int i = 1 ; i < quest.length-1 ;i++){
                if(people!=0){
                    fail[i] = (double)quest[i] / people;
                }else{
                    fail[i] = 0;
                }

                System.out.println(i +" >>" + fail[i]);
                people -= quest[i];
            }

            List<Integer> stageList = new ArrayList<>();//정답 리스트
            for(int i = 1 ; i <= N ;i++){
                stageList.add(i);
            }
            //정렬

            Collections.sort(stageList, (a, b) ->{
                if(fail[a] == fail[b]){
                    return a - b;
                }
                return Double.compare(fail[b], fail[a]);
            });

            for(int i =0 ; i < N ;i++){
                answer[i] = stageList.get(i);
            }




            return answer;
        }
    }
}
