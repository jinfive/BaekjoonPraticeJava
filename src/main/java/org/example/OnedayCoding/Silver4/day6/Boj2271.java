package org.example.OnedayCoding.Silver4.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2271 {



    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            List<Integer> myList = new ArrayList<>();
            List<Integer> answerList = new ArrayList<>();
            for(int i= 0 ; i < n ; i++){
                myList.add(Integer.parseInt(br.readLine()));
            }
            myList.sort(Collections.reverseOrder());
            for(int i = 1 ; i <= n ; i++){
                answerList.add(myList.get(i-1) * i);
            }
            Collections.sort(answerList, Collections.reverseOrder());
            System.out.println(answerList.get(0));


        }
    }
}
