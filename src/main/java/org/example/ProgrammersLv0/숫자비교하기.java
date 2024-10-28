package org.example.ProgrammersLv0;

public class 숫자비교하기 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution(2,3));
    }
}
class Solution4 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        }
        else{
            answer = -1;
        }
        return answer;
    }
}
