package org.example.OnedayCoding.Silver4.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2847 {
  

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int[] game = new int[num];
            for(int i = 0 ; i < num ; i++){
                game[i] = Integer.parseInt(br.readLine());
            }
            int answer = 0;
            for(int i = num - 1 ; i >= 1  ; i--){
                if(game[i] <= game[i - 1]){
                    int cha = game[i - 1] - game[i] + 1;
                    game[i - 1] = game[i] - 1;
                    answer += cha;
                }
            }
            // for(int i = 0 ; i < game.length ; i++){
            //     System.out.println(game[i]);
            // }
            System.out.println(answer);
        }
    }
}
