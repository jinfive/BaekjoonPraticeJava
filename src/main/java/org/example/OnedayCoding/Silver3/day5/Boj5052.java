package org.example.OnedayCoding.Silver3.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj5052 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int test = 0 ; test < t ; test++){
                int n = Integer.parseInt(br.readLine());
                List<String> myList = new ArrayList<>();
                for(int i = 0 ; i  < n ; i++){
                    myList.add(br.readLine());
                }
                Collections.sort(myList);
                boolean flag = false;
                for(int i = 0 ; i < myList.size() - 1 ; i++){
                    if(myList.get(i + 1).startsWith(myList.get(i))){
                        flag = true;
                    }
                    if(flag){
                        sb.append("NO\n");
                        break;
                    }
                }
                if(!flag){
                    sb.append("YES\n");
                }
            }
            // System.out.println(two.startsWith(one));
            System.out.print(sb.toString());

        }
    }
}
