package org.example.OnedayCoding.Silver3.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj12869 {


    public class Main {
        static class SCV{
            int hp1;  // 남은 체력
            int hp2;  // 남은 체력
            int hp3;  // 남은 체력
            int cnt;  // 공격 횟수

            SCV(int hp1, int hp2, int hp3, int cnt) {
                this.hp1 = hp1;
                this.hp2 = hp2;
                this.hp3 = hp3;
                this.cnt = cnt;
            }
        }

        public static void main(String[] args) throws IOException {
            int[] scv = new int[3];
            int N;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) {
                scv[i] = Integer.parseInt(st.nextToken());
            }
            bfs(scv);
        }

        private static void bfs(int[] scv) {
            boolean[][][] visited = new boolean[61][61][61];
            int[][] deal = {{9, 3, 1}, {9, 1, 3}, {3, 9, 1}, {3, 1, 9}, {1, 3, 9}, {1, 9, 3}};
            Queue<SCV> q = new LinkedList<>();

            // 초기 상태: 각 SCV의 원래 체력으로 시작
            visited[scv[0]][scv[1]][scv[2]] = true;
            q.add(new SCV(scv[0], scv[1], scv[2], 0));

            while(!q.isEmpty()) {
                SCV now = q.poll();

                // 모든 SCV가 파괴되었는지 확인
                if(now.hp1 <= 0 && now.hp2 <= 0 && now.hp3 <= 0) {
                    System.out.println(now.cnt);
                    return;
                }

                for(int i=0; i<6; i++) {
                    // 데미지를 빼서 남은 체력 계산
                    int nextHp1 = now.hp1 - deal[i][0];
                    int nextHp2 = now.hp2 - deal[i][1];
                    int nextHp3 = now.hp3 - deal[i][2];

                    // 음수는 0으로 처리 (파괴된 상태)
                    if(nextHp1 < 0) nextHp1 = 0;
                    if(nextHp2 < 0) nextHp2 = 0;
                    if(nextHp3 < 0) nextHp3 = 0;

                    if(visited[nextHp1][nextHp2][nextHp3]) continue;

                    visited[nextHp1][nextHp2][nextHp3] = true;
                    q.add(new SCV(nextHp1, nextHp2, nextHp3, now.cnt+1));
                }
            }
        }
    }

}
