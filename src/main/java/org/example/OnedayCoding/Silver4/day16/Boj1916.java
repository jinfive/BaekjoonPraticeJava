package org.example.OnedayCoding.Silver4.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1916 {

    // The main method must be in a class named "Main".
    class Main {
        private static int N;
        private static int M;
        private static List<Node>[] graph;
        private static int[] distance;
        private static PriorityQueue<Node> pq;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());// 도시수
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 버스수 for

            graph = new ArrayList[N + 1];
            for(int i = 0 ; i <= N ; i++){
                graph[i] = new ArrayList<>();
            }
            distance = new int[N + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            pq = new PriorityQueue<>((o1, o2) ->{
                return o1.cost - o2.cost;
            });
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                graph[start].add(new Node(end, val));

            }

            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            distance[start] = 0;
            pq.add(new Node(start, 0));

            while(!pq.isEmpty()){
                Node now = pq.poll();
                if(distance[now.next] < now.cost){
                    continue;
                }
                for(Node next : graph[now.next]){
                    if(distance[next.next] > distance[now.next] + next.cost){

                        distance[next.next] = distance[now.next] + next.cost;
                        pq.add(new Node(next.next, distance[next.next]));
                    }
                }
            }



            System.out.println(distance[end]);

        }
        private static class Node{
            int next;
            int cost;
            public Node(int next, int cost){
                this.next = next;
                this.cost = cost;
            }
        }
    }
}
