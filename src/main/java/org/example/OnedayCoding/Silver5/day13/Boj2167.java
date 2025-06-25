package org.example.OnedayCoding.Silver5.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2167 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] parent;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            int[][] arr = new int[col][row];

            for(int i = 0 ; i < col ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < row ; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());

                }

            }

            int testCase = Integer.parseInt(br.readLine());
            for(int t = 0 ; t < testCase ; t++){
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken()) - 1;
                int j = Integer.parseInt(st.nextToken()) - 1;
                int x = Integer.parseInt(st.nextToken()) - 1;
                int y = Integer.parseInt(st.nextToken()) - 1;

                int sum = 0;
                for(int colI = i ;colI <= x ; colI++){
                    for(int rowJ = j;rowJ <= y ; rowJ++){
                        sum += arr[colI][rowJ];
                    }
                }
                sb.append(sum +"\n");
            }
            System.out.println(sb.toString());

        }
    }

}
