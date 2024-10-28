package org.example.ProgrammersLv0;

public class 배열만들기1 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        s.solution(10,3);
    }
}

class Solution8 {
    public int[] solution(int n, int k) {
        int[] answer =new int[n/k];
        int c = 0;
        for(int i = k;i<=n;i=i+k) {
            answer[c] = i;
            c++;

        }
        return answer;
    }
}
