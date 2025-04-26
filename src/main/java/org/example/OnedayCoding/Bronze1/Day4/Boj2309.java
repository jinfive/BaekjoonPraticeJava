package org.example.OnedayCoding.Bronze1.Day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2309 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //StringTokenizer st = new StringTokenizer(br.readLine());
            int arr[] = new int[9];
            int sum = 0;
            int del1 = 0;
            int del2 = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                arr[i] =  Integer.parseInt(br.readLine());
                sum += arr[i];
            }
            for(int i = 0 ; i < arr.length ; i++){
                for(int j = i +1 ; j < arr.length ; j++){
                    if(sum - arr[i] - arr[j] == 100){
                        del1 = arr[i];
                        del2 = arr[j];
                    }
                }
            }
            // System.out.println(del1);
            // System.out.println(del2);
            List<Integer> myList  = new ArrayList<>();
            //StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] != del1 && arr[i] != del2){
                    myList.add(arr[i]);
                }
            }
            Collections.sort(myList);

            for(int i  = 0 ; i < myList.size() ;i++){
                System.out.println(myList.get(i));
            }




        }
    }
}
