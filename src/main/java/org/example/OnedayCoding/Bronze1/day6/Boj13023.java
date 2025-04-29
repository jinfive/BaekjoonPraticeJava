package org.example.OnedayCoding.Bronze1.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj13023 {
 
    // The main method must be in a class named "Main".
    class Main {
        private static int n;
        private static int depth = 0;
        private static boolean[] visited;
        private static int answer = 0;
        private static ArrayList<Integer> [] A;
        public static void main(String[] args) throws Exception{
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());


            int n = Integer.parseInt(st.nextToken());//사람수
            int m = Integer.parseInt(st.nextToken());//관계수
            visited = new boolean[n];
            A = new ArrayList[n];
            for(int i = 0 ; i < n ;i++){
                A[i] = new ArrayList<>();
            }

            for(int i = 0 ; i < m ;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                A[a].add(b);
                A[b].add(a);
            }//초기화

            for(int i = 0 ; i < n;i++) {
                DFS(i,depth);
                if(answer == 1) break;
            }
            System.out.println(answer);
        }//main
        private static int DFS(int start , int depth){
            visited[start] = true;
            if(depth == 4 ){
                answer =  1;
                return answer ;
            }

            for(int n: A[start] ){
                if(!visited[n])DFS(n, depth+1);
            }
            visited[start] = false;
            return answer;
        }
    }
}
