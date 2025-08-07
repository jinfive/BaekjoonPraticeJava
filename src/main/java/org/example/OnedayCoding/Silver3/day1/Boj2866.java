package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2866 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<String, Integer> myMap;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
            myMap = new HashMap<>();

            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            char[][] cArr= new char[R][C];
            for(int i = 0 ; i < R ; i++){
                String str = br.readLine();
                for(int j = 0 ; j  < C ; j++){
                    cArr[i][j] = str.charAt(j);
                }
            }
            for(int i = 0 ; i < C ; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0 ; j < R ;j++){
                    sb.append(cArr[j][i]);
                }
                if(!myMap.containsKey(sb.toString())){
                    myMap.put(sb.toString(), sb.toString().length());
                }
                else{
                    System.out.print(0);
                    return;
                }
            }
            // for(Map.Entry<String, Integer> et : myMap.entrySet()){
            //     System.out.println(et.getKey() + " " + et.getValue());
            // }
            boolean flag = true;
            while (true) {
                for(Map.Entry<String, Integer> et : myMap.entrySet()){//종료조건
                    if(et.getValue() == 1){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
                int myMapC = 0;
                Set<String> mySet = new HashSet<>();
                List<String> keyList = new ArrayList<>();
                for(Map.Entry<String, Integer> et : myMap.entrySet()){
                    mySet.add(et.getKey());
                    String nextS = et.getKey().substring(1, et.getKey().length());
                    keyList.add(nextS);
                }

                myMap.clear();
                mySet = new HashSet<>(keyList);
                if(mySet.size() == keyList.size()){
                    for(int i = 0 ; i < keyList.size() ; i++){
                        myMap.put(keyList.get(i), keyList.get(i).length());
                    }
                    answer++;
                }

                else{
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
