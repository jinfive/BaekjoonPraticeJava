package org.example.OnedayCoding.Silver5.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1182 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static int answer = 0;
        private static int target;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int point = Integer.parseInt(st.nextToken());
            target = Integer.parseInt(st.nextToken());
            arr = new int[point];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < point ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            DFS(0, 0);
            System.out.println(answer);


        }
        private static void DFS(int dept, int sum){
            if(dept == arr.length){
                if(target == sum){
                    answer++;
                }
                return;
            }
            if(target > sum && arr[dept] > 0){
                return;
            }

            DFS(dept + 1 , sum + arr[dept]);
            DFS(dept + 1 , sum);
        }
    }

}
