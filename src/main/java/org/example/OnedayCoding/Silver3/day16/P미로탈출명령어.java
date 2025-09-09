package org.example.OnedayCoding.Silver3.day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P미로탈출명령어 {
    

    class Solution {
        private static String answer;
        private static int[] dx = new int[]{1, 0, 0, -1};//남, 서, 동, 북
        private static int[] dy = new int[]{0, -1 , 1, 0};//남, 서, 동, 북
        private static List<String> answerList;
        private static int R;
        private static int C;
        private static int N;//세로
        private static int M;//가로
        private static int K;

        public String solution(int n, int m, int x, int y, int r, int c, int k) {
            answerList = new ArrayList<>();
            K = k;
            if(Math.abs(x - r) + Math.abs(y - c) > k){
                return "impossible";
            }

            if((k - Math.abs(x - r) - Math.abs(y - c)) % 2 != 0) {
                return "impossible";
            }

            R = r;
            C = c;
            N = n;
            M = m;
            DFS(0, x, y, "");
            Collections.sort(answerList);
            System.out.println(answerList);
            if(answerList.get(0).length() == k){
                return answerList.get(0);
            }



            return answer;
        }
        private static void DFS(int dept, int x, int y, String str){
            if(answerList.size() >1 ){
                return;
            }
            if(dept > K){
                return;
            }
            int remainDist = Math.abs(x - R) + Math.abs(y - C);
            int remainMoves = K - dept;
            if (remainDist > remainMoves) return;

            // 패리티 체크: 남은 거리와 남은 이동의 패리티가 다르면 불가능
            if ((remainMoves - remainDist) % 2 != 0) return;
            if(dept == K && x == R && y == C ){

                answerList.add(str);
                return;
            }
            for(int i = 0 ; i < 4 ; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if(nextX >= 1 && nextX <= N && nextY >=1 && nextY <= M ){
                    if(i == 0){

                        DFS(dept + 1, nextX, nextY, str + "d");

                    }
                    else if(i == 1){

                        DFS(dept + 1, nextX, nextY, str + "l");

                    }
                    else if(i == 2){

                        DFS(dept + 1, nextX, nextY, str + "r");

                    }
                    else{

                        DFS(dept + 1, nextX, nextY, str +"u");

                    }
                }
            }

        }
    }
}
