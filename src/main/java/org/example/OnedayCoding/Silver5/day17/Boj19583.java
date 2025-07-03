package org.example.OnedayCoding.Silver5.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj19583 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<String , Integer> peopleMap;
        private static int answer;
        private static Set<String> answerSet;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            peopleMap = new HashMap<>();
            answerSet = new HashSet<>();
            String t1 = st.nextToken();
            String t2 = st.nextToken();
            String t3 = st.nextToken();
            int startTime = changeTime(t1);//시작시간
            int finishTime = changeTime(t2);//종료시간
            int endTime = changeTime(t3);//스트리밍종료시간
            //System.out.println(startTime +" "+ finishTime +" " + endTime);
            while(true){
                String line = br.readLine();
                if(line == null) break;

                st = new StringTokenizer(line);
                int now = changeTime(st.nextToken());
                String name = st.nextToken();

                if(now <= startTime){
                    peopleMap.put(name, 1);
                }
                else if(peopleMap.containsKey(name) &&  now >= finishTime && now <= endTime){
                    answerSet.add(name);
                }
            }
            System.out.println(answerSet.size());
        }
        private static int changeTime(String str){
            String[] arr = str.split(":");
            int h = Integer.parseInt(arr[0]) * 60;
            int m = Integer.parseInt(arr[1]);
            return h + m;

        }
    }
}
