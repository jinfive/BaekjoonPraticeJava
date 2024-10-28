package org.example.ProgrammersLv0;

public class 정수찾기 {
    public static void main(String[] args) {
            Solution s = new Solution();
            //int[] num_list ={1, 2, 3, 4, 5};
            int[] num_list ={15, 98, 23, 2, 15};
            //int n = 3;
            int n =20;
           int answer =  s.solution(num_list, n);
        System.out.println(answer);
    }
}
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        //답안을 적자
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] == n){
                answer++;
                break;
            }
        }
        return answer;
    }
}