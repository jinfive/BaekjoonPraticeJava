package org.example.OnedayCoding.Silver2.Day2;

import java.io.*;
import java.util.*;

public class Boj16236 {

    // BFS 탐색 상태를 저장할 Node 클래스
// Comparable 인터페이스를 구현하여 정렬 기준을 직접 정의
    static class Node implements Comparable<Node> {
        int dist; // 이동 거리
        int y;    // y좌표 (행)
        int x;    // x좌표 (열)

        public Node(int dist, int y, int x) {
            this.dist = dist;
            this.y = y;
            this.x = x;
        }

        // 정렬 기준을 정의하는 메소드
        @Override
        public int compareTo(Node other) {
            // 1. 거리 순 (오름차순)
            if (this.dist != other.dist) {
                return this.dist - other.dist;
            }
            // 2. 거리가 같다면 y좌표 순 (가장 위쪽, 오름차순)
            if (this.y != other.y) {
                return this.y - other.y;
            }
            // 3. y좌표도 같다면 x좌표 순 (가장 왼쪽, 오름차순)
            return this.x - other.x;
        }
    }

    public class Main {
        private static int[] dy = new int[]{-1, 0, 1, 0}; // 상, 좌, 하, 우
        private static int[] dx = new int[]{0, -1, 0, 1};
        private static int[][] map;
        private static int n;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];

            int startY = 0;
            int startX = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if (map[i][j] == 9) {
                        startY = i;
                        startX = j;
                        map[i][j] = 0;
                    }
                }
            }

            int size = 2;
            int eatCount = 0;
            int totalMove = 0;

            while (true) {
                // 💡 PriorityQueue<int[]> -> PriorityQueue<Node>로 변경
                // 람다 표현식 대신 Node 클래스의 compareTo 메소드를 사용하므로 생성자가 깔끔해짐
                PriorityQueue<Node> pq = new PriorityQueue<>();
                boolean[][] visited = new boolean[n][n];

                // 💡 BFS 시작점도 Node 객체로 추가
                pq.add(new Node(0, startY, startX));
                visited[startY][startX] = true;

                boolean fishEaten = false;

                while (!pq.isEmpty()) {
                    // 💡 int[] -> Node 객체로 받음
                    Node now = pq.poll();

                    // 💡 now[0], now[1] 대신 now.dist, now.y 등으로 명확하게 접근
                    if (map[now.y][now.x] != 0 && map[now.y][now.x] < size) {
                        map[now.y][now.x] = 0;
                        eatCount++;
                        totalMove += now.dist;
                        startY = now.y;
                        startX = now.x;
                        fishEaten = true;
                        break;
                    }

                    for (int k = 0; k < 4; k++) {
                        int nextY = now.y + dy[k];
                        int nextX = now.x + dx[k];

                        if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < n && !visited[nextY][nextX] && map[nextY][nextX] <= size) {
                            visited[nextY][nextX] = true;
                            // 💡 다음 탐색 위치도 Node 객체로 추가
                            pq.add(new Node(now.dist + 1, nextY, nextX));
                        }
                    }
                }

                if (!fishEaten) {
                    break;
                }

                if (size == eatCount) {
                    size++;
                    eatCount = 0;
                }
            }

            System.out.println(totalMove);
        }
    }
}
