package org.example.OnedayCoding.Silver4.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj10773 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Deque<Integer> dq = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < n ; i++){
                int num = Integer.parseInt(br.readLine());
                if(num == 0 && !dq.isEmpty()){
                    dq.pop();
                }
                else{
                    dq.push(num);
                }
            }
            int answer = 0;
            while(!dq.isEmpty()){
                answer += dq.pop();
            }
            System.out.println(answer);
        }
    }
}
