package org.example.OnedayCoding.Silver4.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj3986 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int test = Integer.parseInt(st.nextToken());
            int answer = 0;

            for(int i = 0 ; i < test ; i++){
                Deque<Character> dq = new ArrayDeque<>();
                String str = br.readLine();
                char[] cArr = str.toCharArray();
                for(int j = 0 ; j < cArr.length ; j++){
                    if(dq.isEmpty()){
                        dq.push(cArr[j]);
                    }
                    else if(!dq.isEmpty() && dq.peek() == cArr[j]){
                        dq.pop();
                    }
                    else if(!dq.isEmpty() && dq.peek() != cArr[j]){
                        dq.push(cArr[j]);
                    }

                }
                if(dq.isEmpty()){
                    answer++;
                }


            }
            System.out.println(answer);
        }
    }
}
