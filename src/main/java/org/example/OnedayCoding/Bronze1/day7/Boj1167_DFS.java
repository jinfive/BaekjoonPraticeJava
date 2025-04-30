package org.example.OnedayCoding.Bronze1.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1167_DFS {


    // The main method must be in a class named "Main".
    class Main {
        private static List<Node>[] A;//인접리스트
        private static int[] distance;
        private static boolean[] visited;
        private static int maxIndex = 1;


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            //초기화
            A = new ArrayList[n+1];
            for(int i = 0 ; i < n+1 ; i++){
                A[i] = new ArrayList<>();
            }
            distance = new int[n+1];
            visited = new boolean[n+1];

            //인접리스트 값 입력
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                while(true){
                    int e = Integer.parseInt(st.nextToken());
                    if(e == -1 ) break;
                    int v = Integer.parseInt(st.nextToken());
                    A[s].add(new Node(e,v));
                }
            }

            DFS(1);


            for(int i = 2 ; i < distance.length ; i++){
                if(distance[maxIndex] < distance[i]){
                    maxIndex = i;
                }
            }

            distance = new int[n+1];
            visited = new boolean[n+1];
            DFS(maxIndex);
            Arrays.sort(distance);
            System.out.println(distance[n]);




        }//main
        private static void DFS(int v){
            visited[v] = true;
            for(Node node : A[v]){
                if(!visited[node.i]){
                    distance[node.i] =distance[v] + node.value;//현재 노드의 거리 + 앞으로갈 노드 거리
                    DFS(node.i);
                }
            }
        }

        private static class Node{
            int i;
            int value;
            public Node(int i, int value){
                this.i = i;
                this.value = value;
            }
        }
    }//Main


}
