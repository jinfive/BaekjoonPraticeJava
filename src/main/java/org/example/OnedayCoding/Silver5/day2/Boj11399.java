package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11399 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] line;
        private static int[] partSum;
        private static int answer = 0 ;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            //초기화
            line = new int[people];
            partSum = new int[people];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < people ; i++){
                line[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(line);
            partSum[0] = line[0];
            answer = partSum[0];
            for(int i = 1 ; i < people ; i++){
                partSum[i] = line[i] + partSum[i-1];
                answer += partSum[i];
            }
            // for(int i = 0 ; i < people ; i++){
            //     System.out.print(partSum[i]);
            // }
            System.out.print(answer);
        }
    }

}
