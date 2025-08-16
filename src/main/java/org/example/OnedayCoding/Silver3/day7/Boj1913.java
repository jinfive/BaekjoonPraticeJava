package org.example.OnedayCoding.Silver3.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1913 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int target = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];
            StringBuilder sb = new StringBuilder();
            int num = N * N;
            int dir = 0;//0 : 하 ,1: 우, 2:상, 3: 좌
            int x = 0;
            int y = 0;
            int targetX = 0;
            int targetY = 0;
            while(true){
                map[x][y] = num;
                if(num == target){
                    targetX = x + 1;
                    targetY = y + 1;
                }
                num = num - 1;
                if(x == ((N - 1) / 2) && y == ((N - 1) / 2)){
                    break;
                }


                if(dir == 0){// 밑으로 이동
                    if( x + 1 >= N || map[x + 1][y] != 0){
                        dir = 1;
                        y++;
                    }
                    else{
                        x++;
                    }
                }
                else if(dir == 1){// 우로 이동
                    if( y + 1 >= N || map[x][y + 1] != 0){
                        dir = 2;
                        x--;
                    }
                    else{
                        y++;
                    }
                }
                else if(dir == 2){// 위로 이동
                    if(x - 1 < 0 || map[x - 1][y] != 0){
                        dir = 3;
                        y--;
                    }
                    else{
                        x--;
                    }
                }
                else if(dir == 3){// 좌로 이동
                    if(y - 1 < 0 || map[x][y - 1] != 0 ){
                        dir = 0;
                        x++;
                    }
                    else{
                        y--;
                    }
                }

            }
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < N ; j++){
                    sb.append(map[i][j] +" ");
                }
                sb.append("\n");
            }
            sb.append(targetX +" " + targetY);
            System.out.print(sb.toString());
        }
    }
}
