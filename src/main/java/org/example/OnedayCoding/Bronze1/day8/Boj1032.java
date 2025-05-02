package org.example.OnedayCoding.Bronze1.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1032 {


    class Main {
        public static void main(String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            char[][] text = new char[n][];
            for(int i = 0 ; i < n ;i++){
                text[i] = br.readLine().toCharArray();
            }
            for(int i = 0 ; i < text[0].length; i++){
                char now = text[0][i];
                boolean flag = true;
                for(int j = 1 ; j < n ;j++){
                    if(now != text[j][i]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(now);
                } else {
                    System.out.print("?");
                }
            }
        }
    }

}
