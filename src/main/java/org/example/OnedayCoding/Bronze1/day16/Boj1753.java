package org.example.OnedayCoding.Bronze1.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1753 {

    // The main method must be in a class named "Main".
    class Main {
        private static PriorityQueue<Node> pq;
        private static List<Node>[] A;
        private static int[] distance;
        private static boolean[] visited;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());//노드 개수
            int e = Integer.parseInt(st.nextToken());//간선 개수
            int start = Integer.parseInt(br.readLine());
            //초기화
            distance = new int[n+1];

            Arrays.fill(distance,Integer.MAX_VALUE);

            visited = new boolean[n+1];

            pq = new PriorityQueue<>((o1,o2)->{
                return o1.value - o2.value;
            });


            A = new ArrayList[n+1];
            for(int i = 0 ; i <= n ; i++){
                A[i] = new ArrayList<>();
            }
            for(int i = 0 ; i < e ; i++){
                st = new StringTokenizer(br.readLine());
                int go = Integer.parseInt(st.nextToken());
                int next = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());
                A[go].add(new Node(next,value));
            }

            //다익스트라 구현

            pq.add(new Node(start,0));
            distance[start] = 0;
            visited[start] = true;

            while(!pq.isEmpty()){
                Node now = pq.poll();

                if(distance[now.next] < now.value) continue;

                for(Node next : A[now.next]){
                    if(distance[next.next] > now.value + next.value){
                        distance[next.next] = now.value + next.value;
                        visited[next.next] = true;
                        pq.add(new Node(next.next,distance[next.next]));
                    }
                }
            }
            for(int i = 1 ; i < distance.length ; i++){
                if(visited[i]){
                    System.out.println(distance[i]);
                }
                else{
                    System.out.println("INF");
                }
            }


        }

        private static class Node{
            int next;
            int value;

            public Node(int next, int value){
                this.next = next;
                this.value = value;
            }
        }
    }
}
