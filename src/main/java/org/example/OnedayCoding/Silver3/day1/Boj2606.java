package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2606 {


    // The main method must be in a class named "Main".
    class Main {
        private static List<Integer>[] graph;
        private static int C;
        private static boolean[] vistied;
        private static int answer =0;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;// = new StringTokenizer(br.readLine());
            C = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            graph = new ArrayList[C + 1];
            vistied = new boolean[C + 1];
            for(int i = 0 ; i < graph.length ; i ++){
                graph[i] = new ArrayList<>();
            }
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                graph[start].add(end);
                graph[end].add(start);
            }

            DFS(1);
            for(int i = 1 ; i < vistied.length ; i++){
                if(vistied[i]){
                    answer++;
                }
            }
            System.out.println(answer - 1);
        }
        private static void DFS(int now){
            vistied[now] = true;
            for(int next : graph[now]){
                if(!vistied[next]){
                    DFS(next);
                }
            }

        }
    }
}
