package org.example.OnedayCoding.Silver2.Day6;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Boj1912 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int[] D = new int[n];
            D[0] = arr[0];
            int answer = arr[0];
            for(int i = 1 ; i < n ; i++){

                D[i] = Math.max(arr[i], D[i - 1] + arr[i]);
                answer = Math.max(D[i], answer);
            }
            System.out.println(answer);
        }
    }
}
