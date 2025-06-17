package org.example.OnedayCoding.Silver5.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2563 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int arr[][] = new int [101][101];
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                int xStart = Integer.parseInt(st.nextToken());
                int yStart = Integer.parseInt(st.nextToken());
                int xEnd = xStart + 10;
                int yEnd = yStart + 10;
                for(int j = yStart ; j < yEnd ; j++){
                    for(int k = xStart ; k < xEnd ; k++){
                        arr[j][k] = 1;
                    }
                }
            }
            int answer = 0;
            for(int i = 0 ; i < arr.length ; i++){
                for(int j = 0 ; j < arr[i].length ; j++){
                    if(arr[i][j] == 1){
                        answer ++;
                    }

                }
            }
            System.out.println(answer);
        }
    }
}
