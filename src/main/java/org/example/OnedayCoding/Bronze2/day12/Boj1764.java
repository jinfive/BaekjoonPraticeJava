package org.example.OnedayCoding.Bronze2.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1764 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String ,Integer> hash = new HashMap<>();
        List<String> myList = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            String name = br.readLine();
            hash.put(name,1);
        }

        for(int i = 0 ; i < m ; i++){
            String name = br.readLine();
            if(hash.containsKey(name)){
                myList.add(name);
            }
        }

        System.out.println(myList.size());
        Collections.sort(myList);

        for(String str : myList){
            System.out.println(str);
        }

    }
}
