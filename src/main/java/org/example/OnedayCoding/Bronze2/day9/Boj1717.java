package org.example.OnedayCoding.Bronze2.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1717 {

    static int[] parent;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parent = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int question = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (question == 0) {//union
                union(a, b);
            } else { // 두원소 같은지 보기
                boolean result = check(a, b);
                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }


    }

    private static void union(int a, int b) {
        // 대표노드를 찾아서 연결
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;//두개 연결
        }
    }

    private static int find(int a) {
        if (a == parent[a]) {//대표노드
            return a;
        } else {//대표 노드가 아니면
            return parent[a] = find(parent[a]); //value 를 index로 변경해 찾음 재귀 경로 압축
        }
    }

    private static boolean check(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return true;
        else return false;
    }
}
