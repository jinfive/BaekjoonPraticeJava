package org.example.OnedayCoding.Silver3.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1913 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int target =Integer.parseInt(br.readLine());
            int[][] maps = new int[num][num];
            int targetX = 0;
            int targetY = 0;
            int x= 0 ;
            int y = 0;
            num = num * num;
            int dir = 0;// 0 : 아래이동, 1 우로이동, 2: 위로이동, 3:왼쪽이동
            while(true){

                if(target == num){
                    targetX = x;
                    targetY = y;
                }
                if(num == 1){
                    maps[x][y] = num;
                    break;
                }
                maps[x][y] = num--;
                if(dir == 0){//아래
                    if(x + 1 >= maps.length || maps[x+1][y] != 0){
                        y++;
                        dir = 1;
                    }
                    else{
                        x++;
                    }
                }
                else if(dir == 1){//오른쪽
                    if(y + 1 >= maps.length || maps[x][y + 1] != 0){
                        x--;
                        dir = 2;
                    }
                    else{
                        y++;
                    }
                }
                else if(dir == 2){//위로
                    if(x - 1 < 0 || maps[x - 1][y] != 0){
                        y--;
                        dir = 3;
                    }
                    else{
                        x--;
                    }
                }
                else if(dir == 3){//왼쪽
                    if(y - 1< 0 || maps[x][y - 1]!= 0){
                        x++;
                        dir = 0;
                    }
                    else{
                        y--;
                    }
                }

            }//while
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < maps.length ; i++){
                for(int j = 0 ; j < maps.length ; j++){
                    sb.append(maps[i][j] + " ");
                }
                sb.append("\n");
            }
            targetX++;
            targetY++;
            sb.append(targetX + " " + targetY);
            System.out.print(sb.toString());
        }
    }
}
