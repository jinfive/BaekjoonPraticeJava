package org.example.ProgrammersLv0;

public class 각도기 {
}
class Solution9 {
    public int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle== 90 ) {
            answer = 2;
        } else if (angle>90&& angle < 180) {
            answer = 3;
        }
        else
            answer = 4;
        return answer;
    }
}