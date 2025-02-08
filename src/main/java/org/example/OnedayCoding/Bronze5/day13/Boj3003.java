package org.example.OnedayCoding.Bronze5.day13;

import java.util.Scanner;

public class Boj3003 {
    public static void main(String[] args) {
        int king =1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        int [] chase = {1,1,2,2,2,8};


        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
           while (true){
               if(arr[i] == chase[i]){
                   System.out.print(count + " ");
                   break;
               }
               else if(arr[i] > chase[i]){
                   arr[i]--;
                   count--;
               }
               else if(arr[i] < chase[i]){
                   arr[i]++;
                   count++;
               }
           }
        }
    }
}
