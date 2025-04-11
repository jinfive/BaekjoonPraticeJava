package org.example.OnedayCoding.Bronze2.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10811 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bucket = new int[n+1];

        for(int i = 0 ; i <bucket.length ; i++){
            bucket[i] = i;
        }

        for(int j= 0 ; j < m ;j++){
            st =new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == b) continue;
            int s = b -a +1 ;
            int [] arr = new int[s];

            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = bucket[a+i];

            }
            for(int i = 0 ; i < arr.length ; i++){
                bucket[a+i] = arr[s-i -1] ;

            }


        }
        for(int i = 1; i <= n; i++) {
            System.out.print(bucket[i]);
            if(i < n) System.out.print(" ");
        }

    }
}
