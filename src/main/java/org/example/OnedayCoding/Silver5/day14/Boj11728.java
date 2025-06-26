package org.example.OnedayCoding.Silver5.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11728 {


    class Main {
        private static  int[] parent;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n  = Integer.parseInt(st.nextToken());
            int m  = Integer.parseInt(st.nextToken());
            int sum = n + m;
            int[] arr = new int[sum];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i = n ; i < sum ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < arr.length ; i++){
                sb.append(arr[i] + " ");
            }
            System.out.println(sb.toString());
        }
    }

}
