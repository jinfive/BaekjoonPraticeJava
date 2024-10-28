package org.example.ProgrammersLv0;

public class 양꼬치 {

}

class Solution11 {
    public int solution(int n, int k) {
        int answer = 0;
        answer = (12000 * n) + (k * 2000);
        answer = answer - (n / 10) *2000;
        return answer;
    }
}