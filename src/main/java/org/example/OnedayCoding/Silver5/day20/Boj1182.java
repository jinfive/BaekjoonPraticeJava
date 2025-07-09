package org.example.OnedayCoding.Silver5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1182 {


    // The main method must be in a class named "Main".
    class Main {
        private static int answer = 0;
        private static int[] arr;
        private static int n;
        private static int find;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st =new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            find = Integer.parseInt(st.nextToken());
            arr = new int[n];
            st =new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 0 ; i < n ; i++){
                findNum(i, arr[i]);
            }

            System.out.println(answer);

        }

        private static void findNum(int start, int sum){


            if(start == n -1 ){
                if(sum == find){
                    answer++;
                    return;

                }
                return;
            }

            findNum(start + 1 , sum);
            findNum(start + 1, sum + arr[start + 1]);
        }
    }
}
