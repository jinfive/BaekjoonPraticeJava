package org.example.OnedayCoding.Bronze2.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj2750 {



        public static void main(String[] args)throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i]= Integer.parseInt(br.readLine());
            }
            for(int i = 0 ; i < n-1 ; i++){
                for(int j = 0 ; j <n-1 -i ;j++){
                    if(arr[j] > arr[j +1 ]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for(int i = 0 ; i < n ; i++){
                System.out.println(arr[i]);
            }
        

    }
}
