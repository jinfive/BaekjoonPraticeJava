package org.example.OnedayCoding.Silver4.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1759 {
  
    // The main method must be in a class named "Main".
    class Main {
        private static Set<String> answerSet;
        private static String[] alpArr;
        private static StringBuilder sb;
        private static int L;
        public static void main(String[] args) throws Exception{
            // System.out.println("Hello world!");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            L = Integer.parseInt(st.nextToken());//만들 문자 길이
            int C = Integer.parseInt(st.nextToken());//주어진 문자 갯수

            answerSet = new HashSet<>();
            alpArr = new String[C];
            sb = new StringBuilder();

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < C ; i++){
                alpArr[i] = st.nextToken();
                // System.out.print(alpArr[i]);
            }
            Arrays.sort(alpArr);

            code(0, 0, 0, 0, "");
            List<String> answerList = new ArrayList<>(answerSet);
            Collections.sort(answerList);
            for(int i = 0 ; i < answerList.size() ; i++){
                sb.append(answerList.get(i) +"\n");
            }
            System.out.println(sb.toString());


        }
        private static void code( int start, int countA, int countB, int dept, String now){
            if(dept == L - 1 && countB == 0){//가지치기
                return;
            }

            if(dept == L && countA >= 1 && countB >= 2 && now.length() == L){
                answerSet.add(now);
                return;
            }
            for(int i = start ; i < alpArr.length ; i++){
                if(alpArr[i].equals("a") || alpArr[i].equals("e") || alpArr[i].equals("i")
                        || alpArr[i].equals("o") || alpArr[i].equals("u")){
                    code(i + 1, countA + 1, countB, dept + 1 , now + alpArr[i]);
                }
                else{
                    code(i + 1, countA, countB + 1, dept + 1 , now + alpArr[i]);
                }
            }
        }
    }
}
