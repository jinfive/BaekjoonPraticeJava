package org.example.ProgrammersLv0;

public class n의배수 {
    public static void main(String[] args) {
        /*
        정수 num과 n이 매개 변수로 주어질 때,
         num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
         98	2	1
         34	3	0
         */
        Solution2 s = new Solution2();
        System.out.println(s.solution(98,2));


    }
}
class Solution2 {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n >0) {
            answer = 0;
        }
        else answer = 1;
        return answer;
    }
}