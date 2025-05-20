package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj9663 {
    

    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static int answer = 0;
        private static int n;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            nQueen(0);
            System.out.println(answer);
        }
        private static void nQueen(int depth){
            if(depth == n){
                answer++;
                return;
            }
            for(int i = 0 ; i < n ; i++){
                arr[depth] = i;
                if(possibility(depth)){
                    nQueen(depth + 1);
                }
            }
        }

        private static boolean possibility(int col){
            for(int i = 0 ; i < col ; i++ ){//동일한 행에 있는지 검사
                if(arr[col] == arr[i]){
                    return false;
                }
                else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])){// 가로 거리 새로 거리 대각선검사
                    return false;
                }
            }
            return true;

        }

    }
}
