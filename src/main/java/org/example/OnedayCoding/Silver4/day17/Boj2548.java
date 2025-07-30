package org.example.OnedayCoding.Silver4.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj2548 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[][] map;
        private static int answer;
        private static Deque<Integer> dq;
        private static int count = 0;
        private static boolean[][] visited;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            map = new int[5][5];
            dq = new ArrayDeque<>();
            answer = 0;
            visited = new boolean[5][5]; // 추가된 초기화

            for (int i = 0; i < 5; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < 5; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++) {
                    dq.add(Integer.parseInt(st.nextToken()));
                }
            }

            while (!dq.isEmpty()) { // 수정: isEmpty() -> !isEmpty()
                if (answer >= 3) {
                    break;
                }
                int num = dq.poll();
                count++;
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (map[j][k] == num) {
                            visited[j][k] = true;

                        }
                    }
                }
                if (count > 9) {
                    findRow();
                    findCol();
                    findDia();
                }
            }
            System.out.println(count);
        }

        private static void findRow() { // 가로 확인
            for (int i = 0; i < 5; i++) {
                int rCount = 0;
                int zeroCount = 0;
                for (int j = 0; j < 5; j++) {
                    if (visited[i][j]) {
                        rCount++;
                    }
                    if (map[i][j] == 0) {
                        zeroCount++;
                    }
                }
                if (rCount == 5 && zeroCount != 5) {
                    answer++;
                    if (answer == 3) {
                        return;
                    }
                    for (int k = 0; k < 5; k++) {
                        map[i][k] = 0;
                    }
                }
            }
        }

        private static void findCol() {
            for (int i = 0; i < 5; i++) {
                int cCount = 0;
                int zeroCount = 0;
                for (int j = 0; j < 5; j++) {
                    if (visited[j][i]) {
                        cCount++;
                    }
                    if (map[j][i] == 0) {
                        zeroCount++;
                    }
                }
                if (cCount == 5 && zeroCount != 5) {
                    answer++;
                    if (answer == 3) {
                        return;
                    }
                    for (int k = 0; k < 5; k++) {
                        map[k][i] = 0;
                    }
                }
            }
        }

        private static void findDia() {
            int dCount = 0;
            int zeroCount = 0;
            int d2Count = 0;
            int zero2Count = 0;

            for (int i = 0; i < 5; i++) {
                if (visited[i][i]) {
                    dCount++;
                }
                if (map[i][i] == 0) {
                    zeroCount++;
                }

                if (visited[i][4-i]) {
                    d2Count++;
                }
                if (map[i][4-i] == 0) {
                    zero2Count++;
                }
            }

            if (dCount == 5 && zeroCount != 5) {
                answer++;
                if (answer == 3) {
                    return;
                } else {
                    for (int j = 0; j < 5; j++) {
                        map[j][j] = 0;
                    }
                }
            }

            if (d2Count == 5 && zero2Count != 5) {
                answer++;
                if (answer == 3) {
                    return;
                } else {
                    for (int j = 0; j < 5; j++) {
                        map[j][4-j] = 0;
                    }
                }
            }
        }
    }

}
