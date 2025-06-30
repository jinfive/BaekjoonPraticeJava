package org.example.OnedayCoding.Silver5.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2740 {
    
    // The main method must be in a class named "Main".
    class Main {
        private static int[][] arr1;
        private static int[][] arr2;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr1 = new int[n][m];
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < m ;j++){
                    int a = Integer.parseInt(st.nextToken());
                    arr1[i][j] = a;
                }
            }
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr2 = new int[n][m];
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < m ;j++){
                    int a = Integer.parseInt(st.nextToken());
                    arr2[i][j] = a;
                }
            }

            for(int i = 0 ; i < arr1.length ; i++){
                for(int j = 0 ; j < arr2[0].length ; j++){
                    int sum = 0;
                    for(int k = 0 ; k < arr1[i].length ; k++){
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    sb.append(sum + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());




        }
    }
}
