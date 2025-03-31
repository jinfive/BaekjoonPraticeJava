package org.example.OnedayCoding.Bronze3.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Boj1707 {
    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) { // 주어진 테스트 케이스 만큼 돌림
            String [] s = br.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);

            A = new ArrayList[V+1];
            visited = new boolean[V+1];
            check = new int[V+1];
            IsEven = true;
            for (int j = 0; j < V; j++) {
                A[j] = new ArrayList<Integer>();
            }
            for (int j = 0; j < E; j++) {
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);
            }
            //모든 노드에서 DFS 실행
            for(int j = 1 ; j <= V ; j++){
                if(IsEven){
                    DFS(j);
                }
                else {
                    break;
                }
            }
            if(IsEven){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }

    private static void DFS(int start) {
        visited[start] = true;
        for(int j : A[start]){
            if(!visited[j]){
                check[j] = (check[start] + 1) % 2;
                DFS(j);
            }
            else {
                if(check[start] == check[j]){
                    IsEven = false;
                }
            }

        }
    }
}
