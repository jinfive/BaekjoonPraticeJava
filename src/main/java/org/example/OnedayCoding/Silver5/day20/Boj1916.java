package org.example.OnedayCoding.Silver5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj1916 {

    // The main method must be in a class named "Main".
    class Main {
        private static int city;
        private static int bus;
        private static ArrayList<Node>[] graph;//이부분 틀림
        private static int[] distance;
        private static PriorityQueue<Node> pq;
        public static void main(String[] args) throws Exception{
            // System.out.println("Hello world!");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            city = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            bus = Integer.parseInt(st.nextToken());
            distance = new int[city + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            graph = new ArrayList[city + 1];
            for(int i = 0 ; i < city +1 ; i++){
                graph[i] = new ArrayList<>();
            }
            pq = new PriorityQueue<>((o1, o2)  -> {
                return o1.dis - o2.dis;
            });

            for(int i = 0 ; i < bus ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int dis = Integer.parseInt(st.nextToken());
                graph[start].add(new Node(end, dis));

            }
            st = new StringTokenizer(br.readLine());
            int startCity = Integer.parseInt(st.nextToken());
            int findCity = Integer.parseInt(st.nextToken());
            distance[startCity] = 0;
            pq.add(new Node(startCity, 0));
            while(!pq.isEmpty()){
                Node now = pq.poll();

                if(distance[now.start] < now.dis){//갱신 필요 없음
                    continue;
                }
                for(Node next : graph[now.start]){
                    if(distance[next.start] > now.dis + next.dis){//갱신
                        distance[next.start] =  now.dis + next.dis;
                        pq.add(new Node(next.start ,now.dis + next.dis));
                    }
                }
            }

            System.out.println(distance[findCity]);
        }

        private static class Node{
            int start;
            int dis;
            public Node(int start, int dis){
                this.start = start;
                this.dis = dis;
            }
        }
    }
}
