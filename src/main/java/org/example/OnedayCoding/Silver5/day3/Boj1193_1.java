package org.example.OnedayCoding.Silver5.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1193_1 {


    // The main method must be in a class named "Main".
    class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int count = 1;
            int x = 1;
            int y = 1;
            int dir = -1; // 방향
            //dir = 1 이면 왼쪽 대각선 하강 dir = -1 이면 우상향
            while(count < n ){
                if(x == 1 && dir == -1){
                    y++;
                    dir = 1;

                }else if(y == 1 && dir == 1){
                    x++;
                    dir = -1;
                }else if(dir == 1){//왼쪽 대각선 하강
                    y--;
                    x++;
                }else{//dir - 1 우상향
                    x--;
                    y++;
                }
                count++;
            }
            System.out.println(x + "/"+ y);

        }
    }
}
