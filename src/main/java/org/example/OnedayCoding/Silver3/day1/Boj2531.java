package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj2531 {
    

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            Deque<Integer> dq = new ArrayDeque<>();
            int answer = Integer.MIN_VALUE;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());//접시수
            int D = Integer.parseInt(st.nextToken());//가짓수
            int K = Integer.parseInt(st.nextToken());//연속 접시수
            int C = Integer.parseInt(st.nextToken());//쿠폰

            int[] cobab = new int[N];
            for(int i = 0 ; i < N ; i++){
                cobab[i] = Integer.parseInt(br.readLine());
            }
            int[] eat = new int[D + 1];
            int type = 0;
            for(int i = 0 ; i < K ; i++){
                if(eat[cobab[i]] == 0){
                    type++;
                }
                eat[cobab[i]]++;
            }
            answer = type;
            if(eat[C] == 0) answer = type + 1;
            int start = 1;
            int end = K;
            while (true) {
                if(start == N){
                    break;
                }
                if(end == N){
                    end = 0;
                }

                if(eat[cobab[start - 1]] == 1){
                    type--;
                }
                eat[cobab[start - 1]]--;

                if(eat[cobab[end]] == 0 ){
                    type++;
                }
                eat[cobab[end]]++;
                if(eat[C] == 0 ){
                    answer = Math.max(answer, type  + 1);
                }
                else{
                    answer = Math.max(answer, type );
                }
                start++;
                end++;
            }
            System.out.println(answer);
        }
    }
}
