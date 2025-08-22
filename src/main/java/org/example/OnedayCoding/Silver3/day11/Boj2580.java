package org.example.OnedayCoding.Silver3.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2580 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[][] maps;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            maps = new int[9][9];
            for(int i = 0 ; i < 9 ; i ++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < 9 ; j++){
                    maps[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            game(0, 0);

        }
        private static void game(int x, int y){
            if(y == 9){
                game(x + 1 , 0);
                return;
            }
            if(x == 9){
                for(int i = 0 ; i < 9 ; i++){
                    for(int j = 0 ; j < 9 ; j++){
                        System.out.print(maps[i][j] + " ");
                    }
                    System.out.println();
                }
                System.exit(0);
            }
            if(x >= 0 && y >= 0 && maps[x][y] == 0){
                for(int i = 1 ; i <= 9 ;  i++){
                    if(isVal(x, y, i)){
                        maps[x][y] = i;
                        game(x, y + 1);
                        maps[x][y] = 0;
                    }
                }
                return;
            }

            game(x, y + 1);

        }
        private static boolean isVal(int x, int y, int num){
            for(int i = 1 ; i <= 9 ; i++){//행 검사
                if(maps[x][i - 1] == num){
                    return false;
                }
            }
            for(int i = 0 ; i < 9 ; i++){
                if(maps[i][y] == num){
                    return false;
                }
            }
            int colX = x /3 * 3;
            int rowY = y /3 * 3;
            for(int i = colX ; i < colX + 3 ; i++){
                for(int j = rowY ; j < rowY + 3 ; j++){
                    if(maps[i][j] == num){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
