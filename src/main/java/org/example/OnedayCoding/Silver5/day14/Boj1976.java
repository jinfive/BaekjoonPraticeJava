package org.example.OnedayCoding.Silver5.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1976 {

    class Main {
        private static  int[] parent;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int city = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int play = Integer.parseInt(st.nextToken());
            parent = new int[city + 1];
            for(int i = 0 ; i < parent.length ; i++){
                parent[i] = i;
            }


            // 인접 행렬 읽기 - 값을 실제로 읽어야 함
            for(int i = 0; i < city; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < city; j++){
                    int connected = Integer.parseInt(st.nextToken()); // 값을 읽음
                    if(connected == 1){  // 읽은 값이 1이면 연결
                        union(i + 1, j + 1);
                    }
                }
            }
            st = new StringTokenizer(br.readLine());
            int visited[] = new int[play];
            for(int i = 0 ; i < play ; i++){
                int now = Integer.parseInt(st.nextToken());
                visited[i] = now;
            }
            boolean flag = true;


            for(int i = 0 ; i < play - 1 ; i++){
                if(find(visited[i]) != find(visited[i+1])){
                    flag = false;
                }
            }

            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
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
            return  parent[a] = find(parent[a]);
        }
    }

}
