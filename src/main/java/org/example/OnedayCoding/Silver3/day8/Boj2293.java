package org.example.OnedayCoding.Silver3.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj2293 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] D = new int[k + 1];
            D[0] = 1;
            int [] arr= new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            for(int i = 0 ; i < n ; i++){
                for(int j = arr[i] ;  j <= k ; j++){
                    D[j] = D[j] + D[j - arr[i]];
                }
            }
            System.out.println(D[k]);
        }
    }
}
