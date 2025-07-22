package org.example.OnedayCoding.Silver4.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1149 {

    class Main {
        public static void main(String[] args) throws Exception{
            int firsrtMin = 0;

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int house = Integer.parseInt(st.nextToken());
            int[][] costArr = new int[house][3];
            int[][] D = costArr;
            for(int i = 0 ; i < costArr.length ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < 3 ; j ++){
                    costArr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            D[0][0] = costArr[0][0];
            D[0][1] = costArr[0][1];
            D[0][2] = costArr[0][2];

            firsrtMin = Math.min(costArr[0][0], Math.min(costArr[0][1], costArr[0][2]));

            for(int i = 1; i < house ; i++){

                for(int j = 0; j < 3 ; j++){
                    if(D[i-1][j] != firsrtMin){
                        D[i][j] = firsrtMin + costArr[i][j];
                    }
                    else{
                        int secondMin = Integer.MAX_VALUE;
                        for(int k = 0 ; k < 3 ; k++){
                            if(k != j){
                                secondMin = Math.min(costArr[i-1][k], secondMin);
                            }
                        }
                        D[i][j] = secondMin + costArr[i][j];
                    }
                }
                firsrtMin = Math.min(costArr[i][0], Math.min(costArr[i][1], costArr[i][2]));
            }
            // for(int i = 0 ; i < house ; i++){
            //     for(int j = 0 ; j< 3 ;j++){
            //         System.out.print(D[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            int answer = Math.min(D[house - 1][0], Math.min(D[house - 1][1], D[house - 1][2]));
            System.out.println(answer);
        }
    }

}
