package org.example.OnedayCoding.Silver2.Day7;

import java.util.*;
import java.io.*;
public class Boj2630 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[][] map;
        private static int wCount = 0;
        private static int bCount = 0;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            StringTokenizer st;
            for(int i = 0 ; i < n ; i ++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < n ; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            chek(0, 0, n);
            System.out.println(wCount);
            System.out.println(bCount);
        }
        private static void chek(int x, int y, int size){
            int startColor = map[x][y];
            boolean flag = colorCheck(x, y, size);
            if(flag){
                if(startColor == 1){
                    bCount++;
                }
                else{
                    wCount++;
                }
                return;
            }
            else{
                chek(x, y, size / 2);//1사분면
                chek(x, y + (size / 2) , size / 2);//2사분면
                chek(x+ size/2 , y, size /2);//3사분면
                chek(x + size /2, y + size/2, size/2);//4사분면
            }
        }
        private static boolean colorCheck(int x, int y, int size){
            int startColor = map[x][y];
            for(int i = x ; i < x + size ; i++){
                for(int j = y ; j < y+ size ; j++){
                    if(map[i][j] != startColor){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
