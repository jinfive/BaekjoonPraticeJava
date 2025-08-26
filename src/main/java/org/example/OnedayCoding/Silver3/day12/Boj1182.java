package org.example.OnedayCoding.Silver3.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1182 {
    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static int N;
        private static int S;
        private static boolean[] visited;
        private static int answer = 0;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            arr = new int[N];
            visited = new boolean[N];
            st = new StringTokenizer(br.readLine());

            for(int i = 0 ; i < N ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            DFS(0, 0, 0);
            System.out.println(answer);
        }
        private static void DFS(int start, int sum, int len){
            if(sum == S && len > 0){
                answer++;

            }
            for(int i = start ; i < N ; i ++){
                if(!visited[i]){
                    visited[i] = true;
                    DFS(i , sum + arr[i],len + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
