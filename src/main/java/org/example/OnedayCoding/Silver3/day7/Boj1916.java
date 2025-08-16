package org.example.OnedayCoding.Silver3.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1916 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());//도시수
            int M = Integer.parseInt(br.readLine());//버스수
            int[] distance = new int[N + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            List<Node>[] graph = new ArrayList[N + 1];
            for(int i = 0 ; i < N + 1 ; i++){
                graph[i] = new ArrayList<>();
            }
            StringTokenizer st;
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                graph[start].add(new Node(end, val));
            }
            PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) ->{
                return o1.val - o2.val;
            });
            st = new StringTokenizer(br.readLine());
            int start =  Integer.parseInt(st.nextToken());
            int end =  Integer.parseInt(st.nextToken());
            distance[start] = 0;
            pq.add(new Node(start, 0));
            while(!pq.isEmpty()){
                Node now = pq.poll();
                if(distance[now.city] < now.val) continue;
                for(Node next : graph[now.city]){
                    if(distance[next.city] > distance[now.city] + next.val){
                        distance[next.city] = distance[now.city] + next.val;
                        pq.add(new Node(next.city, distance[next.city]));
                    }
                }
            }

            System.out.println(distance[end]);
        }
        private static class Node{
            int city;
            int val;
            public Node(int city, int val){
                this.city = city;
                this.val = val;
            }
        }
    }
}
