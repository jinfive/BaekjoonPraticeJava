package org.example.OnedayCoding.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2252 {

    // The main method must be in a class named "Main".
    class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            //초기화
            List<Integer>[] A = new ArrayList[N+1];
            int[] indegree = new int[N+1];
            Deque<Integer> dq = new ArrayDeque<>();

            for(int i = 0 ; i <= N ; i++){
                A[i] = new ArrayList<>();
            }

            for(int i = 0 ; i < E; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int next = Integer.parseInt(st.nextToken());
                A[start].add(next);
                indegree[next]++;
            }


            for(int i = 1 ; i < indegree.length ; i++){
                if(indegree[i] == 0){
                    dq.add(i);
                }
            }

            while(!dq.isEmpty()){
                int now = dq.poll();
                System.out.print(now+" ");
                for(int next : A[now]){
                    indegree[next]--;
                    if(indegree[next] == 0){
                        dq.add(next);
                    }
                }
            }

        }
    }
}
