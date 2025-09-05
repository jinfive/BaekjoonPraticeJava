package org.example.OnedayCoding.Silver3.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2206 {


    class Main {
        private static int[][] map;
        private static boolean[][][] visited;
        private static int n, m;
        private static int[] dx = {-1, 0, 1, 0};
        private static int[] dy = {0, 1, 0, -1};

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            map = new int[n][m];
            visited = new boolean[n][m][2]; // 0: 벽 안부심, 1: 벽 부심

            for(int i = 0; i < n; i++) {
                char[] cArr = br.readLine().toCharArray();
                for(int j = 0; j < m; j++) {
                    map[i][j] = cArr[j] - '0';
                }
            }

            System.out.println(bfs());
        }

        private static int bfs() {
            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(0, 0, 1, 0)); // x, y, distance, broken
            visited[0][0][0] = true;

            while(!queue.isEmpty()) {
                Node current = queue.poll();

                // 도착점에 도달한 경우
                if(current.x == n-1 && current.y == m-1) {
                    return current.dist;
                }

                for(int i = 0; i < 4; i++) {
                    int nx = current.x + dx[i];
                    int ny = current.y + dy[i];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        // 벽이 아닌 경우
                        if(map[nx][ny] == 0 && !visited[nx][ny][current.broken]) {
                            visited[nx][ny][current.broken] = true;
                            queue.add(new Node(nx, ny, current.dist + 1, current.broken));
                        }
                        // 벽인 경우 (아직 벽을 부수지 않았다면)
                        else if(map[nx][ny] == 1 && current.broken == 0 && !visited[nx][ny][1]) {
                            visited[nx][ny][1] = true;
                            queue.add(new Node(nx, ny, current.dist + 1, 1));
                        }
                    }
                }
            }

            return -1;
        }

        private static class Node {
            int x, y, dist, broken;

            public Node(int x, int y, int dist, int broken) {
                this.x = x;
                this.y = y;
                this.dist = dist;
                this.broken = broken;
            }
        }
    }

}
