package org.example.OnedayCoding.Silver2.Day5;
import java.util.*;
public class P미로탈출명령ㅇ {

    class Solution {
        private static int[] dx = new int[]{1, 0 , 0, -1};//남, 서, 동,북
        private static int[] dy = new int[]{0, -1,  1, 0};//남, 서, 동 북
        private static int[][] map;
        private static List<String> answerList;
        private static int N;
        private static int M;
        private static int X;
        private static int Y;
        private static int R;
        private static int C;
        private static int K;

        public String solution(int n, int m, int x, int y, int r, int c, int k) {
            N = n;
            M = m;
            X = x ;
            Y = y ;
            R = r ;
            C = c ;
            K = k;
            String answer = "";
            map = new int[n][m];
            answerList = new ArrayList<>();
            if(Math.abs(x -r) + (y - c) > k){

                return "impossible";
            }
            if((k - Math.abs(x - r) - Math.abs(y - c)) % 2 != 0) {
                return "impossible";
            }
            DFS(X, Y, 0, "");


            Collections.sort(answerList);
            if(answerList.size() > 0 ){
                return answerList.get(0);
            }
            return answer;

        }
        private static void DFS(int x, int y, int dept, String str){
            if(answerList.size() > 1){
                return;
            }
            if(dept > K){
                return;
            }
            int dist = Math.abs(x - R) + Math.abs(y - C);
            int move = K - dept;
            if(dist > move) return;
            if((move - dist ) % 2 != 0) return;
            if(dept == K && x == R && y == C){
                answerList.add(str);
                return;
            }


            for(int i = 0 ; i < 4 ; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if(nextX >=1 && nextX <= N && nextY >=1 && nextY <= M){
                    if(i == 0){
                        DFS(nextX, nextY, dept + 1 , str +"d");
                    }
                    else if(i == 1){
                        DFS(nextX, nextY, dept + 1 , str +"l");
                    }
                    else if(i == 2){
                        DFS(nextX, nextY, dept + 1 , str +"r");
                    }
                    else{
                        DFS(nextX, nextY, dept + 1 , str +"u");
                    }
                }
            }

        }
    }
}
