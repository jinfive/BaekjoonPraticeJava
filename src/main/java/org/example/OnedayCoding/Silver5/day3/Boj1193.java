package org.example.OnedayCoding.Silver5.day3;

import java.util.Scanner;

public class Boj1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        int x = 1;
        int y = 1;
        int dir = -1;

        while(count<n){
            if(x == 1 && dir ==-1){
                y++;
                dir = 1;
            }
            else if(y == 1  && dir ==1){
                x++;
                dir = -1;
            }
            else if(dir == 1){ //하좌
                y --;
                x ++;
            }
            else if(dir == -1){//우상
                x --;
                y ++;
            }
            count++;

        }
        System.out.println(x +"/"+y);
        sc.close();

    }
}
