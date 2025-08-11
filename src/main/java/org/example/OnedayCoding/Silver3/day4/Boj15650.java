package org.example.OnedayCoding.Silver3.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15650 {

    // The main method must be in a class named "Main".
    class Main {
        private static int N;
        private static int M;
        private static boolean[] visited;
        private static StringBuilder sb;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            sb = new StringBuilder();
            visited = new boolean[N + 1];
            DFS(0, 0 ,"");
            System.out.print(sb.toString());

        }
        private static void DFS(int dept, int now, String str){
            if(dept == M){
                sb.append(str+"\n");
                return;
            }
            for(int i = 1 ; i <= N ; i++ ){
                if(!visited[i] && i > now){
                    visited[i] = true;
                    visited[i] = true;
                    DFS(dept + 1, i, str + i +" ");
                    visited[i] = false;
                }
            }
        }
    }
}
