package org.example.OnedayCoding.Silver4.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj2331 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Long> numList = new ArrayList<>();
            long A = Long.parseLong(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int answer = 0;
            Map<Long, Integer> numberMap = new HashMap<>();
            numList.add(A);
            numberMap.put(A, 1);
            int index = 0;
            long target = 0;
            while(true){
                Long next = 0l;
                String n = numList.get(index) +"";
                for(int i = 0 ; i < n.length() ; i++){
                    long temp = (long)n.charAt(i)-'0';
                    next += (long)Math.pow(temp, P);
                }
                if(!numberMap.containsKey(next)){
                    numberMap.put(next, 1);
                    numList.add(next);
                    index++;
                }
                else{
                    target = next;
                    break;
                }
            }

            for(int i = 0 ; i < numList.size() ; i++){
                if(numList.get(i) != target){
                    answer++;
                }
                else{
                    break;
                }
            }

            //System.out.println((long)Math.pow(4, 2));16
            System.out.println(answer);
        }
    }
}
