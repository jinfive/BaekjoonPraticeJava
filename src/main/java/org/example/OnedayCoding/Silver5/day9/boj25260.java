package org.example.OnedayCoding.Silver5.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj25260 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<String, Double> gradeMap;
        private static Double subjectCount = 0.0;
        private static Double totalSum = 0.0;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            gradeMap = new HashMap<>();
            gradeMap.put("A+" , 4.5);
            gradeMap.put("A0" , 4.0);
            gradeMap.put("B+" , 3.5);
            gradeMap.put("B0" , 3.0);
            gradeMap.put("C+" , 2.5);
            gradeMap.put("C0" , 2.0);
            gradeMap.put("D+" , 1.5);
            gradeMap.put("D0" , 1.0);
            gradeMap.put("F" , 0.0);

            for(int i = 0 ; i < 20 ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                Double score = Double.parseDouble(st.nextToken());
                String grade = st.nextToken();
                if(gradeMap.containsKey(grade)){
                    totalSum += gradeMap.get(grade) * score;
                    subjectCount += score;
                }

            }
            System.out.println(totalSum / subjectCount);


        }
    }
}
