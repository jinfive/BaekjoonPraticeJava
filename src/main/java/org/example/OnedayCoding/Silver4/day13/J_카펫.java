package org.example.OnedayCoding.Silver4.day13;

public class J_카펫 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];//열 , 행
            int row = 3;//행
            int col =0;//열
            int sum = brown + yellow;
            while(true){
                if(sum % row == 0){
                    col = sum / row;
                    if(brown == ((row - 1) * 2) + col + col - 2){
                        answer[0] = col;
                        answer[1] = row;
                        break;
                    }
                }
                row++;
            }
            return answer;
        }
    }
}
