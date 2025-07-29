package org.example.OnedayCoding.Silver4.day17;

public class J_캐릭터의좌표 {
    class Solution {
        public int[] solution(String[] keyinput, int[] board) {

            int nowX = 0;
            int nowY = 0;
            for(int i = 0 ; i < keyinput.length ; i++){
                if(keyinput[i].equals("up")){
                    if(isVal(board,nowX ,nowY + 1)){
                        System.out.println(i);
                        nowY++;
                    }
                }
                else if(keyinput[i].equals("down")){
                    if(isVal(board,nowX ,nowY - 1 )){
                        System.out.println(i);
                        nowY--;
                    }
                }
                else if(keyinput[i].equals("left")){
                    if(isVal(board,nowX -1 ,nowY)){
                        System.out.println(i);
                        nowX--;
                    }
                }
                else if(keyinput[i].equals("right")){
                    if(isVal(board,nowX + 1 ,nowY )){
                        System.out.println(i);
                        nowX++;
                    }
                }
            }
            int[] answer = new int[]{nowX, nowY};
            return answer;
        }
        private static boolean isVal(int[] board, int nextX, int nextY){
            int xL = board[0] / 2;
            int yL = board[1] / 2;
            if(nextX >= xL * -1 && nextX <= xL && nextY >= yL * -1 && nextY <= yL){
                return true;
            }

            return false;
        }
    }
}
