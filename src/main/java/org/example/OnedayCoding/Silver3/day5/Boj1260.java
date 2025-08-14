package org.example.OnedayCoding.Silver3.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1260 {


    // The main method must be in a class named "Main".
    class Main {
        private static List<Integer>[] graph;
        private static boolean[] visited;
        private static Deque<Integer> dq;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());//정점의 수
            int M = Integer.parseInt(st.nextToken());//간선의 수
            int start = Integer.parseInt(st.nextToken());//시작지점
            graph = new ArrayList[N + 1];
            visited  = new boolean[N + 1];
            for(int i = 0 ; i < graph.length ; i++){
                graph[i] = new ArrayList<>();
            }
            dq = new ArrayDeque<>();
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a].add(b);
                graph[b].add(a);
            }
            for(int i= 0 ; i < N + 1; i++){
                Collections.sort(graph[i]);
            }
            DFS(start);
            visited = new boolean[N + 1];
            dq.add(start);
            System.out.println();

            visited[start] = true;
            BFS();
        }
        private static void DFS(int now){
            System.out.print(now+" ");
            visited[now] = true;
            for(int next : graph[now]){
                if(!visited[next]){
                    DFS(next);
                }
            }
        }
        private static void BFS(){
            while(!dq.isEmpty()){
                int now = dq.poll();
                System.out.print(now+" ");
                for(int next : graph[now]){
                    if(!visited[next]){

                        dq.add(next);
                        visited[next] = true;
                    }
                }

            }
        }
    }
}
