package org.example.OnedayCoding.Silver4.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj28278 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int test = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();
            Deque<Integer> dq = new ArrayDeque<>();
            for(int i = 0 ; i < test ; i++){
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                if(n == 1){
                    int num = Integer.parseInt(st.nextToken());
                    dq.push(num);
                }
                else if(n == 2){
                    if(dq.isEmpty()){
                        sb.append(-1 +"\n");
                    }
                    else{
                        sb.append(dq.pop() +"\n");
                    }
                }
                else if(n == 3){
                    sb.append(dq.size() +"\n");
                }
                else if(n == 4){
                    if(dq.isEmpty()){
                        sb.append(1 +"\n");
                    }
                    else{
                        sb.append(0 +"\n");
                    }
                }
                else{
                    if(dq.isEmpty()){
                        sb.append(-1 +"\n");
                    }
                    else{
                        sb.append(dq.peek()+"\n");
                    }

                }
            }
            System.out.println(sb.toString());


        }
    }
}
