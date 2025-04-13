package org.example.OnedayCoding.Bronze2.Day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1940 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = n -1;
        int sexyCount = 0;

        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum < m){
                start++;
            }
            else if(sum > m){
                end--;
            }
            else{
                start++;
                end--;
                sexyCount++;
            }
        }
        System.out.println(sexyCount);

    }
}
