package org.example.OnedayCoding.Silver5.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2161 {


    // The main method must be in a class named "Main".
    class Main {
        private static Set<Integer> mySet;
        private static List<Integer> myList;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            mySet = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){

                int num = Integer.parseInt(st.nextToken());
                mySet.add(num);
            }
            myList = new ArrayList<>(mySet);
            Collections.sort(myList);
            for(int i = 0 ; i < myList.size() ; i++){
                sb.append(myList.get(i) + " ");
            }

            System.out.println(sb.toString());




        }
    }
}
