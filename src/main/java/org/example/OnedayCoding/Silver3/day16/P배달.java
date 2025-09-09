package org.example.OnedayCoding.Silver3.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class P배달 {


    class Solution {
        public int solution(int N, int[][] road, int K) {
            int answer = 0;
            int[] distance = new int[N + 1];
            Arrays.fill(distance, Integer.MAX_VALUE);
            List<Node>[] roadList = new ArrayList[N + 1];
            for(int i = 0 ; i < roadList.length ; i++){
                roadList[i] = new ArrayList<>();
            }

            PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
                return o1.cost - o2.cost;
            });

            for(int i = 0 ; i < road.length ; i++){
                roadList[road[i][0]].add(new Node(road[i][1], road[i][2]));
                roadList[road[i][1]].add(new Node(road[i][0], road[i][2]));
            }

            distance[1] = 0;
            pq.add(new Node(1, 0));

            while(!pq.isEmpty()){
                Node now = pq.poll();
                if(distance[now.node] < now.cost){
                    continue;
                }
                for(Node next : roadList[now.node]){
                    if(distance[next.node] > distance[now.node] + next.cost && distance[now.node] + next.cost <= K){
                        distance[next.node] = distance[now.node] + next.cost;
                        pq.add(new Node(next.node, distance[next.node]));
                    }
                }
            }
            for(int i = 1 ; i < distance.length ; i++){
                if(distance[i] <= K){
                    answer++;
                }
            }


            return answer;
        }
        private static class Node{
            int node;
            int cost;
            public Node(int node, int cost){
                this.node = node;
                this.cost = cost;
            }
        }
    }
}
