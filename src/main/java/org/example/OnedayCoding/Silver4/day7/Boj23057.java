package org.example.OnedayCoding.Silver4.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj23057 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static int N;
        private static int Sum;
        private static Set<Integer> comSet;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            comSet = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                Sum += arr[i];
            }

            for(int i = 1 ; i <= N ; i++){
                com(0, i, 0, 0);
            }
            System.out.println(Sum - comSet.size());







        }
        private static void com(int start, int maxDept, int nowDept, int sum){
            if(nowDept == maxDept){
                comSet.add(sum);
                return;
            }
            for(int i = start ; i < N ; i++){
                com(i + 1, maxDept, nowDept + 1, sum + arr[i]);
            }
        }
    }
}
