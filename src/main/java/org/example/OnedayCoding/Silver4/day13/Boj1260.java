package org.example.OnedayCoding.Silver4.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1260 {


    class Main {
        private static ArrayList<Integer>[] graph;
        private static boolean[] visited;
        private static Deque<Integer> dq;
        private static StringBuilder sb;


        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());//노드수
            int M = Integer.parseInt(st.nextToken());//간선수
            int V = Integer.parseInt(st.nextToken());//시작점

            graph = new ArrayList[N + 1];
            for(int i = 0 ; i < graph.length ; i++){
                graph[i] = new ArrayList<>();
            }
            dq = new ArrayDeque<>();
            visited = new boolean[N + 1];

            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                graph[start].add(end);
                graph[end].add(start);
            }
            for(int i = 0 ; i < graph.length ; i++){
                Collections.sort(graph[i]);
            }

            sb = new StringBuilder();
            DFS(V);
            System.out.println(sb.toString());

            visited = new boolean[N + 1];
            sb = new StringBuilder();
            BFS(V);
            System.out.println(sb.toString());


        }
        private static void DFS(int num){
            visited[num] = true;
            sb.append(num + " ");
            for(int now : graph[num]){
                if(!visited[now]){
                    DFS(now);
                }
            }
        }
        private static void BFS(int num){
            dq.add(num);
            visited[num] = true;
            while (!dq.isEmpty()) {
                int now = dq.poll();
                sb.append(now + " ");
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
