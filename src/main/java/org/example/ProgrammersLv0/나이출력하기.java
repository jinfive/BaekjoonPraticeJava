package org.example.ProgrammersLv0;

public class 나이출력하기 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.solution(40));
    }
}
class Solution6 {
    public int solution(int age) {
        int answer = 0;
        int current = 2022;
        answer = 2022 - age +1;
        return answer;
    }
}
