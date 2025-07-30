package org.example.OnedayCoding.Silver4.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj25192 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Set<String> people = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            br.readLine();
            for(int i = 1 ; i < n ; i++){
                String now = br.readLine();
                if(now.equals("ENTER")){
                    answer += people.size();
                    people = new HashSet<>();
                }
                else{
                    people.add(now);
                }
            }
            answer += people.size();
            System.out.println(answer);
        }
    }
}
