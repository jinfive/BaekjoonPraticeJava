package org.example.OnedayCoding.Silver5.day18;

import java.util.ArrayDeque;
import java.util.Deque;

public class J_지게차와크레인 {
    
    class Solution {
        private static char[][] Storage;
        private static boolean[][] visited;
        private static int answer = 0;
        private static String[] Requests;
        private static Deque<int[]> dq;
        private static int[] dx = new int[]{1, 0 , -1, 0};//북, 동, 남, 서
        private static int[] dy = new int[]{0, 1 , 0, -1};//북, 동, 남, 서
        public int solution(String[] storage, String[] requests) {

            Storage = new char[storage.length + 2][storage[0].length() + 2];
            for(int i = 0 ; i < Storage.length ; i++){
                for(int j = 0 ; j < Storage[i].length ; j++){
                    if(i == 0 || i == Storage.length - 1){
                        Storage[i][j] = 'e';
                    }
                    else if(j == 0 || j == Storage[i].length - 1){
                        Storage[i][j] = 'e';
                    }
                    else{
                        Storage[i][j] = storage[i-1].charAt(j-1);
                    }

                }
            }

            // for(int i = 0 ; i < Storage.length ; i++){
            //     for(int j = 0 ; j < Storage[i].length ; j++){
            //         System.out.print(Storage[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            Requests = requests;
            dq = new ArrayDeque<>();
            for(int i = 0 ; i < Requests.length ; i++){
                if(Requests[i].length() == 1){//지게차
                    visited = new boolean[storage.length + 2][storage[0].length() + 2];
                    car(0, 0, Requests[i].charAt(0));
                }
                else{//크레인
                    char find = Requests[i].charAt(0);
                    for(int j = 0 ; j < Storage.length ; j++){
                        for(int k = 0 ; k < Storage[j].length ; k++){
                            if(Storage[j][k] == find){
                                Storage[j][k] = 'e';
                            }
                        }
                    }
                }
            }
            for(int i = 0 ; i < Storage.length ; i++){
                for(int j = 0 ; j < Storage[i].length ; j++){
                    if(Storage[i][j] != 'e'){
                        answer++;
                    }
                }
            }


            return answer;
        }
        private static void car(int x, int y, char c){
            visited[x][y] = true;
            dq.add(new int[]{x, y});
            while(!dq.isEmpty()){
                int[] now = dq.poll();
                int nowX = now[0];
                int nowY = now[1];

                for(int i = 0 ; i < 4; i++){
                    int nextX = nowX + dx[i];
                    int nextY = nowY + dy[i];
                    if(nextX >= 0 && nextY >= 0 &&
                            nextX < Storage.length && nextY < Storage[nowX].length &&
                            !visited[nextX][nextY]){
                        if(Storage[nextX][nextY] == 'e'){
                            visited[nextX][nextY] = true;
                            dq.add(new int[]{nextX, nextY});
                        }else if(Storage[nextX][nextY] == c){
                            visited[nextX][nextY] = true;
                            Storage[nextX][nextY] = 'e';
                        }
                    }
                }
            }
        }
    }
}
