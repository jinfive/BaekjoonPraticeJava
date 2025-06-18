package org.example.OnedayCoding.Silver5.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1260 {


    // The main method must be in a class named "Main".
    class Main {
        private static boolean[] visited;
        private static List<Integer>[] graph;
        private static Deque<Integer> dq;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int edge = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            dq = new ArrayDeque<>();
            //초기화
            visited = new boolean[node + 1];
            graph = new ArrayList[node + 1];

            for(int i = 0 ; i < node + 1 ; i++){
                graph[i] = new ArrayList<>();
            }
            for(int i = 0 ; i < edge ; i++){
                st = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());
                graph[n1].add(n2);
                graph[n2].add(n1);

            }

            for(int i = 0 ; i < graph.length ; i++){
                Collections.sort(graph[i]);
            }
            dfs(start);
            visited = new boolean[node + 1];
            System.out.println();
            bfs(start);


        }

        private static void dfs(int start){
            visited[start] = true;
            System.out.print(start + " ");
            for(int num : graph[start]){
                if(!visited[num]){
                    dfs(num);
                }
            }
        }
        private static void bfs(int start){
            visited[start] = true;
            dq.add(start);
            while(!dq.isEmpty()){
                int now = dq.poll();
                System.out.print(now + " ");
                for(int num : graph[now]){
                    if(!visited[num]){
                        visited[num] = true;
                        dq.add(num);
                    }
                }

            }
        }
    }
}
