package org.example.OnedayCoding.Silver2.Day3;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Boj11053 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];
            int[] d = new int[n + 1];
            int answer = Integer.MIN_VALUE;
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int i = 1 ; i <= n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 1 ; i < n + 1 ; i++){
                for(int j = 0 ; j < i ; j++){
                    if(arr[i] > arr[j]){
                        d[i] = Math.max(d[i], d[j] + 1);
                    }

                }

                answer = Math.max(d[i], answer);
            }
            System.out.println(answer);
        }
    }
}
