package org.example.OnedayCoding.Bronze2.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class Boj3040 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<Character,Integer> hash;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[9];
            int sum = 0;

            for(int i= 0 ; i < 9 ; i++){
                int n = Integer.parseInt(br.readLine());
                arr[i] = n;
                sum += n;
            }
            boolean flag = true;
            for(int i = 0 ; i < 8 && flag ; i++){
                for(int j = i+1 ; j < 9 && flag;j++){
                    if(sum - (arr[i]+arr[j]) == 100){
                        arr[i] = 0;
                        arr[j] = 0;
                        flag = false;
                    }
                }
            }

            for(int i : arr){
                if(i != 0){
                    System.out.println(i);
                }
            }


        }
    }
}
