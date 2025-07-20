package org.example.OnedayCoding.Silver4.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj11656 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // StringTokenizer st = new StringTokenizer(br.readLine());
            String str = br.readLine();
            List<String> myList = new ArrayList<>();

            for(int i = 0 ; i < str.length() ; i++){
                myList.add(str.substring(i, str.length()));
            }

            StringBuilder sb = new StringBuilder();
            Collections.sort(myList);
            for(int i = 0 ; i < myList.size() ; i++){
                sb.append(myList.get(i) + "\n");
            }
            System.out.println(sb.toString());
        }
    }
}
