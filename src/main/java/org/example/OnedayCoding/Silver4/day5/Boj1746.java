package org.example.OnedayCoding.Silver4.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1746 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args)throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            List<String> myList = new ArrayList<>();
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Map<String, Integer> noHear = new HashMap<>();
            for(int i = 0 ; i < n ; i++){

                noHear.put(br.readLine() , 1);
            }
            for(int i = 0 ; i < m ; i++){
                String name = br.readLine();
                if(noHear.containsKey(name)){
                    myList.add(name);
                }
            }
            Collections.sort(myList);
            sb.append(myList.size() +"\n");
            for(int i =  0 ; i < myList.size();i++){
                sb.append(myList.get(i)+"\n");
            }
            System.out.println(sb.toString());
        }
    }
}
