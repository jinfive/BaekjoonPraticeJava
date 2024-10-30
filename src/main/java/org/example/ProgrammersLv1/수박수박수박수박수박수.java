package org.example.ProgrammersLv1;

import java.util.Arrays;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(3));
    }
}

class Solution1 {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {

            if(i % 2 == 0) {
                sb.append("박");
            }
            else {
                sb.append("수");
            }
        }
        answer = sb.toString();

        return answer;
    }
}



