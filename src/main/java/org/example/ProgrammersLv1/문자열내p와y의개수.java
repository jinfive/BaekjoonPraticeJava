package org.example.ProgrammersLv1;

public class 문자열내p와y의개수  {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println( s.solution("pPoooyY"));
        System.out.println(s.countp);
        System.out.println(s.county);

    }
}

class Solution {
    int countp =0;
    int county =0;

    boolean solution(String s) {
        boolean answer = true;
        //charAt를 이용해서
        //반복문을 이용해서
        //카운트 하자

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P' || c == 'p'){
                countp++;
            }
            if(c == 'Y' || c == 'y'){
                county++;
            }
        }
        if(countp != county){
            answer = false;
        }
        return answer;
    }
}