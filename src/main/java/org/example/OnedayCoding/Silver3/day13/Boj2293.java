package org.example.OnedayCoding.Silver3.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2293 {
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] coin= new int[n];
            int[] answer = new int[k + 1];
            answer[0] = 1;
            for(int i = 0 ; i < n ; i++){
                coin[i] = Integer.parseInt(br.readLine());
            }
            for(int i= 0 ; i < n ; i++){
                for(int j = 1 ; j <= k ; j++){
                    if(coin[i] <= j){
                        answer[j] = answer[j] + answer[j - coin[i]];
                    }
                }
            }
            System.out.println(answer[k]);
        }
    }
}
