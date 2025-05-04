package org.example.OnedayCoding.Bronze1.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj2178 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] dx = new int[] {0, 0, 1, -1}; // 동 서 남 북
        private static int[] dy = new int[] {1, -1, 0, 0}; // 동 서 남 북

        private static boolean[][] visted; //방문 배열
        private static Deque<int[]> myQue = new ArrayDeque<>(); //BFS에서 이용한 류
        private static int [][] A;//문제 배열
        private static int n , m;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());//행
            m = Integer.parseInt(st.nextToken());//열

            A = new int [n][m];
            visted = new boolean [n][m];

            for(int i = 0 ; i < n ;i++){
                String str = br.readLine();
                for(int j = 0 ; j < m ; j++){
                    A[i][j] = str.charAt(j)-'0';
                    //System.out.print(A[i][j]);
                }
                //System.out.println();
            }
            BFS(0,0);
            System.out.println(A[n-1][m-1]);


        }
        //BFS 구현
        private static void BFS(int a ,int b){
            visted[a][b] = true;
            myQue.add(new int[]{a,b});

            while(!myQue.isEmpty()){
                int[] now = myQue.poll();
                for(int i = 0 ; i < 4 ; i++){
                    int x = now[0] + dx[i];
                    int y = now[1] + dy[i];
                    if(x >= 0 && y >= 0 && x < n  && y <m){
                        if(A[x][y] != 0 && !visted[x][y]){
                            visted[x][y] = true;
                            A[x][y] = A[now[0]][now[1]] + 1;
                            myQue.add(new int[]{x,y});
                        }
                    }

                }
            }
        }
    }
}
