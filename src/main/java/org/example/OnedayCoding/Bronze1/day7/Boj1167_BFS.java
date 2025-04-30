package org.example.OnedayCoding.Bronze1.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1167_BFS {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] distance;
        private static boolean[] visited;
        private static List<Edge>[] A;//인접리스트
        private static Deque<Integer> myQue;//BFS큐
        private static int maxIndex = 1;


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            distance = new int[n+1];
            visited = new boolean[n+1];
            myQue = new ArrayDeque<>();

            A = new ArrayList[n+1];
            for(int i = 1 ; i < n+1 ; i++){
                A[i] = new ArrayList<>();
            }//인접리스트 초기화

            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                while(true){
                    int E = Integer.parseInt(st.nextToken());
                    if(E == -1){
                        break;
                    }
                    int V =Integer.parseInt(st.nextToken());
                    A[s].add(new Edge(E, V));
                }
            }//인접리스트 생성
            BFS(1);
            for(int i =2 ; i<=n ;i++){
                if(distance[maxIndex] < distance[i]){
                    maxIndex = i;
                }
            }

            distance = new int [n+1];
            visited = new boolean[n+1];

            BFS(maxIndex);
            Arrays.sort(distance);
            System.out.println(distance[n]);



        }

        private static class Edge{
            int e;
            int value;
            public Edge(int e, int value){
                this.e = e;
                this. value = value;
            }
        }

        private static void BFS(int v){
            visited[v] = true;
            myQue.add(v);
            while(!myQue.isEmpty()){
                int now = myQue.poll();
                for(Edge i : A[now]){
                    int e = i.e;
                    int val = i.value;
                    if(!visited[e]){
                        visited[e] = true;
                        myQue.add(e);
                        distance[e] = distance[now] + val;
                    }
                }
            }
        }
    }


}
