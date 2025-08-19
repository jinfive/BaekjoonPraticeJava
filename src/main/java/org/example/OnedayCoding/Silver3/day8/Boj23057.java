package org.example.OnedayCoding.Silver3.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj23057 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static Set<Integer> mySet;
        private static boolean[] visited;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            int N = Integer.parseInt(br.readLine());
            mySet = new HashSet<>();
            arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }
            visited = new boolean[N];
            for(int i = 1; i <= N ; i++){
                DFS(0,0, 0, i);
            }
            int answer = 0;

            System.out.println(sum - mySet.size());

        }
        private static void DFS(int start ,int dept, int sum, int maxDept){
            if(dept == maxDept){
                mySet.add(sum);
                return;
            }
            for(int i = start ; i < arr.length ; i++){
                if(!visited[i]){
                    visited[i] = true;
                    DFS(i ,dept + 1, sum + arr[i] , maxDept);
                    visited[i] = false;
                }
            }
        }
    }
}
