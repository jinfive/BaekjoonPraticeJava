package org.example.ProgrammersLv0;

public class 게임369 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(294321));
    }
}
class Solution1 {
    public int solution(int order) {
        int answer = 0;
        String str = order + "";
        char[] chars =str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '3' || chars[i] == '6' || chars[i] == '9') {
                answer++;
            }
        }


        return answer;
    }
}