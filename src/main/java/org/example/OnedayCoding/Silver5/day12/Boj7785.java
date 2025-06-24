package org.example.OnedayCoding.Silver5.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj7785 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            HashMap<String, Boolean> peopleMap = new HashMap<>();
            StringBuilder sb= new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int people = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < people ; i++){
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String visit = st.nextToken();
                boolean vt = true;
                if(visit.equals("enter")){
                    vt = true;
                }
                else{
                    vt = false;
                }
                peopleMap.put(name , vt);
            }
            List<String> peopleList = new ArrayList<>();
            for(Map.Entry<String, Boolean> et : peopleMap.entrySet()){
                if(et.getValue()){
                    peopleList.add(et.getKey());
                }
            }
            Collections.sort(peopleList, Collections.reverseOrder());
            for(int i = 0 ; i < peopleList.size() ; i++){
                sb.append(peopleList.get(i) + "\n");
            }
            System.out.println(sb.toString());
        }
    }
}
