package org.example.OnedayCoding.Bronze1.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1236 {

    // The main method must be in a class named "Main".
    class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());//행
            int b = Integer.parseInt(st.nextToken());//열
            int maxA = 0 ;
            int maxB = 0;
            String[][] arr = new String[a][b];
            for(int i = 0 ; i < a ;i++){
                String str = br.readLine();
                for(int j = 0 ; j < b ;j++){
                    arr[i][j] = str.charAt(j)+"";
                }
            }

            for(int i = 0 ; i < a ;i++){
                boolean flag = true;
                for(int j = 0 ; j < b ;j++){
                    if(arr[i][j].equals("X")){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    maxA++;
                }
            }
            for(int i = 0 ; i < b ;i++){
                boolean flag = true;
                for(int j = 0 ; j < a ;j++){
                    if(arr[j][i].equals("X")){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    maxB++;
                }
            }
            System.out.println(Math.max(maxA,maxB));



        }
    }
}
