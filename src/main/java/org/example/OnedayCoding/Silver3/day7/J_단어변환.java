package org.example.OnedayCoding.Silver3.day7;

public class J_단어변환 {


    class Solution {
        private static int answer = Integer.MAX_VALUE;
        private static String Target;
        private static String[] Words;
        private static boolean[] visited;
        public int solution(String begin, String target, String[] words) {

            // for(int i = 0 ; i < words.length ; i++){
            //     System.out.println(isVal(begin, words[i]));
            // }
            // return answer;
            Target = target;
            Words = words;
            visited = new boolean[words.length];
            boolean flag = false;
            for(int i = 0 ; i < words.length ; i++){
                if(words[i].equals(target)){
                    flag = true;
                }
            }
            if(!flag){
                return 0;
            }
            DFS(0,begin);
            return answer;
        }
        private static void DFS(int dept, String now){
            if(now.equals(Target)){
                answer = Math.min(answer, dept);
                return;
            }
            for(int i = 0 ; i < Words.length ; i++){
                if(isVal(now, Words[i]) && !visited[i]){
                    visited[i] = true;
                    DFS(dept + 1, Words[i]);
                    visited[i] = false;
                }
            }
        }
        private static boolean isVal(String now, String next){
            if(now.length() != next.length()){
                return false;
            }
            else{
                int count = 0;
                for(int i = 0 ; i < now.length() ; i++){

                    if(now.charAt(i) == next.charAt(i)){
                        count++;

                    }

                }
                if(count == now.length() - 1){
                    return true;
                }
                return false;
            }

        }
    }
}
