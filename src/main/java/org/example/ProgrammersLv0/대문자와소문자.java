package org.example.ProgrammersLv0;

public class 대문자와소문자 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        System.out.println(s.solution("cccCCC"));

    }
}
//아스키코드 0 = 48 , a = 97 A =65
class Solution12 {
    public String solution(String m) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) >= 'a' && m.charAt(i) <= 'z') {
                char ch = m.charAt(i);
                ch = (char) (ch -32);
                sb.append(ch);
            }
            else if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z') {
                char ch = m.charAt(i);
                ch = (char) (ch +32);
                sb.append(ch);

            }
        }
        answer = sb.toString();
        return answer;
    }
}