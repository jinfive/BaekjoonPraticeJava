package org.example.OnedayCoding.Bronze2.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj11724 {


    static boolean visted[];
    static ArrayList<ArrayList<Integer>> A;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visted = new boolean[n + 1]; // 0번 인덱스는 사용 안함
        A = new ArrayList<>();

        // 0번 인덱스에 더미 리스트 추가 (사용하지 않음)
        A.add(new ArrayList<>());

        // 1번부터 n번까지의 정점에 대한 리스트 추가
        for (int i = 1; i <= n; i++) {
            A.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A.get(start).add(end);
            A.get(end).add(start);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visted[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visted[v]) {
            return;
        }
        visted[v] = true;
        for (int i : A.get(v)) {
            if (!visted[i]) {
                DFS(i);
            }
        }
    }


}
