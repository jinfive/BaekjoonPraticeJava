package org.example.OnedayCoding.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1717 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] parent;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            parent = new int[n+1];
            for(int i = 1 ; i < parent.length ; i++){
                parent[i] = i;
            }

            for(int t = 0 ; t < m ; t++){
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(v == 0){//union연산
                    union(a, b);
                }
                else{//find 연산
                    int first = find(a);
                    int second = find(b);
                    if(first == second){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }

        private static void union(int a, int b){
            a = find(a);
            b = find(b);
            if(a != b){
                parent[b] = a;
            }

        }
        private static int find(int a){
            if(parent[a] == a){
                return a;
            }
            return parent[a] = find(parent[a]);
        }
    }
}
