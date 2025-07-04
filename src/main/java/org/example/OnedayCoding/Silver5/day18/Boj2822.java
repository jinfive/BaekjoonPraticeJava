package org.example.OnedayCoding.Silver5.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2822 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            int[][] arr = new int[8][2];
            int[] arr2 = new int[5];
            for(int i = 1 ; i <= 8 ; i++){
                arr[i-1][0] = i;
                arr[i-1][1] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr, (o1, o2) ->{
                return o2[1] - o1[1];
            });
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 5 ; i++){
                sum += arr[i][1];
                arr2[i] = arr[i][0];
            }
            Arrays.sort(arr2);
            for(int i = 0 ; i < 5 ; i++){
                sb.append(arr2[i] + " ");
            }

            System.out.println(sum);

            System.out.println(sb.toString());
        }
    }
}
