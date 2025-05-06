package org.example.OnedayCoding.Bronze1.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOj11557 {

    // The main method must be in a class named "Main".
    class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br  = new BufferedReader (new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCase = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < testCase ; i++){
                int n = Integer.parseInt(br.readLine());
                Map<String ,Integer> myHash = new HashMap<>();
                List <Integer> myList = new ArrayList<>();
                for(int j = 0 ; j < n ; j++){
                    st = new StringTokenizer(br.readLine());
                    String name = st.nextToken();
                    int num = Integer.parseInt(st.nextToken());
                    myHash.put(name , num);
                    myList.add(num);
                }
                Collections.sort(myList);
                int big = myList.get(myList.size()-1);

                for(Map.Entry<String,Integer> et : myHash.entrySet()){
                    if(et.getValue() == big){
                        System.out.println(et.getKey());
                    }
                }

            }
        }
    }
}
