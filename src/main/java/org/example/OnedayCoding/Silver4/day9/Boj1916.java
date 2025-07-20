package org.example.OnedayCoding.Silver4.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1916 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());


            PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) ->{
                return o1.val - o2.val;
            });
            int N = Integer.parseInt(st.nextToken());// 동네 수
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());// 버스수
            List<Node>[] graph = new ArrayList[N + 1];

            for(int i = 0 ; i < N + 1 ; i++){
                graph[i] = new ArrayList<>();
            }

            int[] distance = new int[N + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());

                graph[start].add(new Node(end, val));
            }
            st = new StringTokenizer(br.readLine());
            int startPoint  = Integer.parseInt(st.nextToken());
            int targetPoint = Integer.parseInt(st.nextToken());
            distance[startPoint] = 0;
            pq.add(new Node(startPoint, 0));

            while (!pq.isEmpty()) {
                Node now = pq.poll();
                if(distance[now.next] < now.val) continue;
                for(Node next : graph[now.next]){

                    if(distance[next.next] > distance[now.next] + next.val){
                        distance[next.next] = distance[now.next] + next.val;
                        pq.add(new Node(next.next, distance[next.next]));
                    }
                }
            }

            System.out.println(distance[targetPoint]);

        }
        private static class Node{
            int next;
            int val;
            public Node(int next, int val){
                this.next = next;
                this.val = val;
            }
        }
    }
}
