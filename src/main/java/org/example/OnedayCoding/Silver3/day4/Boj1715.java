package org.example.OnedayCoding.Silver3.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Boj1715 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<Long> answerList = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>((o1, o2) -> {
                return Long.compare(o1, o2);
            });



            for(int i = 0 ; i < N ; i++){
                pq.add(Long.parseLong(br.readLine()));
            }
            long answer = 0;




            for(int i = 1 ; i < N ; i++){
                long sum = 0;
                if(pq.size() > 1){
                    long first = pq.poll();
                    long second = pq.poll();
                    sum = first + second;
                    pq.add(sum);
                    answerList.add(sum);
                }
            }
            for(int i = 0 ; i < answerList.size() ; i++){
                answer += answerList.get(i);
            }
            System.out.println(answer);
        }
    }
}
