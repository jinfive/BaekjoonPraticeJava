package org.example.ProgrammersLv0;

public class 나머지구하기 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(3, 2));
    }
}
class Solution3 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer=num1 % num2;
        return answer;
    }
}
