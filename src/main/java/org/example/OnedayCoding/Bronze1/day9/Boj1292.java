package org.example.OnedayCoding.Bronze1.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj1292 {

    // The main method must be in a class named "Main".
    class Main {
        private static int a;
        private static int b;
        private static int[] arr;
        private static int[] sum;
        private static ArrayList<Integer> myList;
        public static void main (String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            myList = new ArrayList<>();
            for(int i = 1 ; i < b ;i++){
                for(int j = 0 ; j < i ;j++){
                    myList.add(i);
                }

            }
            arr = myList.stream()
                    .mapToInt(i -> i)
                    .toArray();
            sum = new int[b +1];
            sum[0] = 1;

            for(int i = 1 ; i < b ; i++){
                sum[i] = sum[i-1] + arr[i];
                // System.out.println(sum[i]);

            }
            if(a == 1){
                System.out.println(sum[b-1]);
            }
            else{
                System.out.println(sum[b-1] - sum[a-2]);
            }


        }


    }
}
