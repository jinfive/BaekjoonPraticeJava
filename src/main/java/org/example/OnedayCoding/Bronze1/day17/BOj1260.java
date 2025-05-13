package org.example.OnedayCoding.Bronze1.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOj1260 {

    public class Main {
        private static boolean[] visited;
        private static ArrayList<Integer>[] A;
        private static Deque<Integer> myQue;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            //초기화
            A = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                A[i] = new ArrayList<>();
            }
            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                A[a].add(b);
                A[b].add(a);
            }
            myQue = new ArrayDeque<>();
            for (int i = 1; i <= n; i++) {
                Collections.sort(A[i]);
            }
            visited = new boolean[n + 1];
            DFS(start);
            System.out.println();
            visited = new boolean[n + 1];
            BFS(start);


        }

        private static void DFS(int start) {
            visited[start] = true;
            System.out.print(start + " ");
            for (int n : A[start]) {
                if (!visited[n]) {
                    DFS(n);
                }
            }

        }

        private static void BFS(int start) {
            myQue.add(start);
            visited[start] = true;

            while (!myQue.isEmpty()) {
                int now = myQue.poll();
                System.out.print(now + " ");
                for (int n : A[now]) {
                    if (!visited[n]) {
                        myQue.add(n);
                        visited[n] = true;
                    }
                }
            }

        }
    }

}
