package org.example.OnedayCoding.Silver5.day14;

import java.util.ArrayDeque;
import java.util.Deque;

public class J_지게차와크레인 {
    class Solution {
        private static char[][] Storage;
        private static boolean[][] visited;
        private static int[] dx = new int[]{-1 , 0, 1, 0};//북 동 남 서
        private static int[] dy = new int[]{0, 1, 0, -1};//북 동 남 서
        private static int answer = 0;
        private static Deque<int[]> dq;
        public int solution(String[] storage, String[] requests) {
            //초기화
            Storage = new char [storage.length + 2][storage[0].length() + 2];
            visited = new boolean [storage.length + 2][storage[0].length() + 2];
            dq = new ArrayDeque<>();

            for(int i = 0 ; i < Storage.length ; i++){
                for(int j = 0 ; j < Storage[0].length ; j++){
                    if(i == 0 || i == Storage.length - 1 || j == 0 || j == Storage[0].length - 1){
                        Storage[i][j] = 'e';
                    }
                    else{
                        Storage[i][j] = storage[i - 1].charAt(j - 1);
                    }
                }
            }
            // for(int i = 0 ; i < Storage.length ; i++){
            //     for(int j = 0 ; j < Storage[0].length ; j++){
            //         System.out.print(Storage[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            for(int i = 0 ; i < requests.length ; i++){
                if(requests[i].length() == 1){//지게차
                    visited = new boolean [storage.length + 2][storage[0].length() + 2];
                    BFS(0, 0, requests[i].charAt(0));
                }
                else{//크레인
                    for(int j = 1 ; j < Storage.length -1 ; j++){
                        for(int k = 1 ; k < Storage[0].length -1 ; k++){
                            if(Storage[j][k] == requests[i].charAt(0)){
                                Storage[j][k] = 'e';
                            }
                        }
                    }
                }
            }
            for(int i = 0 ; i < Storage.length ; i++){
                for(int j = 0 ; j < Storage[0].length ; j++){
                    if(Storage[i][j] != 'e'){
                        answer++;
                    }
                }

            }



            return answer;
        }
        private static void BFS(int nowX, int nowY,char request){
            dq.add(new int[]{nowX , nowY});
            visited[nowX][nowY] = true;
            while(!dq.isEmpty()){
                int[] arr = dq.poll();
                nowX = arr[0];
                nowY = arr[1];
                for(int i = 0 ; i < 4 ; i++){
                    int nextX = nowX + dx[i];
                    int nextY = nowY + dy[i];
                    if(nextX >= 0 && nextY >= 0 && nextX < Storage.length && nextY < Storage[nextX].length
                            &&!visited[nextX][nextY] &&
                            (Storage[nextX][nextY] == 'e' || Storage[nextX][nextY] == request)){
                        if(Storage[nextX][nextY] == 'e'){
                            visited[nextX][nextY] = true;
                            dq.add(new int[]{nextX, nextY});
                        }
                        else{
                            visited[nextX][nextY] = true;
                            Storage[nextX][nextY] = 'e';
                        }

                    }
                }
            }
        }
    }
}
