package org.example.OnedayCoding.Silver4.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj1913 {


    // The main method must be in a class named "Main".
    class Main {
        private static Meet[] meet;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            // int answer = Integer.MAX_VALUE;
            PriorityQueue<Meet> pq = new PriorityQueue<>((o1, o2) -> {
                return o1.startTime - o2.startTime;
            });
            int answer = 0;
            int N = Integer.parseInt(st.nextToken());
            meet = new Meet[N];
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                int startTime = Integer.parseInt(st.nextToken());
                int endTime = Integer.parseInt(st.nextToken());

                meet[i] = new Meet(startTime, endTime);
            }
            Arrays.sort(meet, (o1, o2) -> {

                if(o1.endTime != o2.endTime){
                    return o1.endTime - o2.endTime;
                }


                return o1.startTime - o2.startTime;
            });
            int endTime = -1;
            for(int i = 0 ; i < N ; i++){
                if(meet[i].startTime >= endTime){
                    endTime = meet[i].endTime;
                    answer++;
                }
            }

            System.out.println(answer);
        }





        private static class Meet{
            int startTime;
            int endTime;
            int consumeTime;
            public Meet(int startTime, int endTime){
                this.startTime = startTime;
                this.endTime = endTime;
                this.consumeTime = endTime - startTime;
            }
        }
    }
}
