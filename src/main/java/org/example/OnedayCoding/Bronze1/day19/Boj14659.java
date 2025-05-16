package org.example.OnedayCoding.Bronze1.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj14659 {



    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static int[] Countarr;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            Countarr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int answer = 0;
            for(int i = 0 ; i < n -1 ; i++){
                for(int j = i + 1; j < n ; j++){
                    if(arr[i] < arr[j]){
                        break;
                    }
                    Countarr[i]++;

                }
            }
            Arrays.sort(Countarr);
            System.out.println(Countarr[Countarr.length-1]);

        }
    }
}
