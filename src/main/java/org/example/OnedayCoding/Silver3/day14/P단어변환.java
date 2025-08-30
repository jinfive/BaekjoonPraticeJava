package org.example.OnedayCoding.Silver3.day14;

public class P단어변환 {
    class Solution {
        private static String Target;
        private static String[] Words;
        private static int answer = Integer.MAX_VALUE;
        private static boolean[] visited;
        public int solution(String begin, String target, String[] words) {
            boolean flag = true;
            for(int i = 0 ; i < words.length ; i++){
                if(words[i].equals(target)){
                    flag = false;
                    break;
                }
            }
            Target = target;
            Words = words;
            visited = new boolean[words.length];
            if(flag){
                return 0;
            }
            find(begin , 0);

            return answer;
        }
        private static void find(String now, int dept){
            if(now.equals(Target)){
                answer = Math.min(dept, answer);
                return;
            }
            for(int i = 0 ; i < Words.length ; i++){
                if(isVal(now, Words[i]) && !visited[i]){
                    visited[i] = true;
                    find(Words[i], dept + 1);
                    visited[i] = false;
                }
            }
        }
        private static boolean isVal(String now, String next){
            if(now.length() != next.length()){
                return false;
            }
            int count = 0;
            for(int i =0 ; i < now.length() ; i++){
                if(now.charAt(i) == next.charAt(i)){
                    count++;
                }
            }
            if(count + 1 == now.length()){
                return true;
            }
            return false;
        }
    }
}
