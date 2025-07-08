package org.example.OnedayCoding.Silver5.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2669 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            int[][] arr = new int[101][101];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for(int t = 0 ; t < 4 ; t++){
                String[] strA = br.readLine().split(" ");
                int startY = Integer.parseInt(strA[0]);
                int startX = Integer.parseInt(strA[1]);
                int endY = Integer.parseInt(strA[2]);
                int endX = Integer.parseInt(strA[3]);
                for(int i = startX ; i < endX ; i++){
                    for(int j = startY ; j < endY ; j++){
                        arr[i][j] = 1;
                    }
                }
            }
            int answer = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                for(int j = 0 ; j < arr[i].length ; j++){
                    if(arr[i][j] == 1){
                        answer++;

                    }

                }

            }

            System.out.println(answer);

        }
    }
}
