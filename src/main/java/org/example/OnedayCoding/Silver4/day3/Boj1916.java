package org.example.OnedayCoding.Silver4.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1916 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int city = Integer.parseInt(br.readLine());
            int bus = Integer.parseInt(br.readLine());
            boolean[] visited = new boolean[city + 1];
            PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
                return o1.value - o2.value;
            });

            int[] distance = new int[city + 1];

            List<Node>[] graph = new List[city + 1];
            for(int i = 0 ; i < graph.length ; i++){
                graph[i] = new ArrayList<>();
            }

            for(int i = 0 ; i < bus ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());
                graph[start].add(new Node(end, value));
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startCity = Integer.parseInt(st.nextToken());
            int endCity = Integer.parseInt(st.nextToken());
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[startCity] = 0;
            pq.add(new Node(startCity, 0));

            while(!pq.isEmpty()){
                Node now = pq.poll();
                if(visited[now.end]) continue;
                visited[now.end] = true;
                for(Node next : graph[now.end]){
                    if(distance[next.end] > distance[now.end] + next.value){//더 작은 거리 발견
                        distance[next.end] = next.value + distance[now.end];
                        pq.add(new Node(next.end, now.value+next.value));
                    }

                }
            }
            System.out.println(distance[endCity]);
        }
        private static class Node{
            int end;
            int value;
            public Node(int end, int value){
                this.end = end;
                this.value = value;
            }
        }
    }
}
