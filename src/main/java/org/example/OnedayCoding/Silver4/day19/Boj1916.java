package org.example.OnedayCoding.Silver4.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj1916 {
    import java.util.*;
import java.lang.*;
import java.io.*;

    class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            StringTokenizer st ;
            PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
                return o2.cost - o1.cost;
            });
            ArrayList<Node>[] graph = new ArrayList[N + 1];
            for(int i = 0 ; i < N + 1 ; i++){
                graph[i] = new ArrayList<>();
            }
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                graph[start].add(new Node(end, val));
            }

            int[] distance = new int[N + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            distance[start] = 0;
            pq.add(new Node(start, 0));
            while(!pq.isEmpty()){
                Node now = pq.poll();
                if(distance[now.city] < now.cost){
                    continue;
                }
                for(Node next : graph[now.city]){
                    if(distance[next.city] > distance[now.city] + next.cost){
                        distance[next.city] = distance[now.city] + next.cost;
                        pq.add(new Node(next.city, distance[now.city] + next.cost));
                    }
                }
            }
            System.out.println(distance[end]);

        }
        private static class Node{
            int city;
            int cost;
            public Node(int city, int cost){
                this.city = city;
                this.cost = cost;
            }
        }
    }

}
