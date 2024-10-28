package org.example.ProgrammersLv0;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution(3,2));


    }
}
class Solution7 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double r= 0.0;
        r = ((double)num1 / num2)*1000;
        answer = (int)r;
        return answer;
    }
}
