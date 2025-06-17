package org.example.OnedayCoding.Silver5.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj10815 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<Integer, Integer> mMap;
        private static int[] nArr;
        private static int[] answerArr;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());

            mMap = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < m ; i++){

                int num =  Integer.parseInt(st.nextToken());
                mMap.put(num , 1);
            }
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            nArr = new int[n];
            answerArr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){

                int num =  Integer.parseInt(st.nextToken());
                nArr[i] = num;
            }
            for(int i = 0 ; i < nArr.length ; i++){
                if(mMap.containsKey(nArr[i])){
                    answerArr[i] ++;
                }
            }
            for(int i = 0 ; i < answerArr.length ; i++){
                if(answerArr[i] >= 1){
                    System.out.print(1 +" ");
                }
                else{
                    System.out.print(0 +" ");
                }
            }
        }
    }
}
