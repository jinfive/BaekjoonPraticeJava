package org.example.OnedayCoding.Bronze1.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj10798 {
    // The main method must be in a class named "Main".
    class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
            char[][] arr = new char[5][15];

            for(int i = 0 ; i < 5 ; i++){
                for(int j = 0 ; j < 15 ; j++){
                    arr[i][j] = ' ';
                }
            }
            for(int i = 0 ; i < 5 ; i++){
                char[] text  =  br.readLine().toCharArray();
                for(int j = 0 ; j < text.length ; j++){
                    arr[i][j] = text[j];
                }

            }


            for(int i = 0 ; i < 15; i++){//15
                for(int j = 0 ; j < 5 ; j++){//5
                    if(arr[j][i] != ' '){
                        System.out.print(arr[j][i]);
                    }
                    else{
                        continue;
                    }
                }
            }

        }
    }


}
