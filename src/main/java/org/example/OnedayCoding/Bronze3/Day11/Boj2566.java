package org.example.OnedayCoding.Bronze3.Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int x =0;
        int y = 0;
        for(int i = 0 ; i < 9 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9 ; j++){
                int temp =max;
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > temp){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((x+1) + " " + (y+1));



    }
}
