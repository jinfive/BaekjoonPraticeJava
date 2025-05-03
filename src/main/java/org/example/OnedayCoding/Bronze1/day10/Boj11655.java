package org.example.OnedayCoding.Bronze1.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj11655 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            // System.out.println((int)'A'); 65
            // System.out.println((int)'Z'); 90 90을 넘으면 - 26
            // System.out.println((int)'a'); 97
            // System.out.println((int)'z'); 122
            char[] arr = br.readLine().toCharArray();

            for(int i = 0 ; i < arr.length ; i++){
                if((int)arr[i] >= 65 && (int)arr[i]<= 90){//대문자인 상황
                    arr[i] += 13;
                    if((int)arr[i] > 90){
                        int temp = (int)arr[i] - 26;
                        arr[i] = (char)temp;
                    }else{
                        arr[i] = (char)arr[i];
                    }
                    sb.append(arr[i]);
                }
                else if((int)arr[i] >= 97 && (int)arr[i]<= 122){//소문자인 상황

                    arr[i] += 13;
                    if((int)arr[i] > 122){
                        int temp = (int)arr[i] - 26;
                        arr[i] = (char)temp;
                    }else{
                        arr[i] = (char)arr[i];
                    }
                    sb.append(arr[i]);
                }
                else{
                    sb.append(arr[i]);
                }

            }
            System.out.println(sb);
        }
    }



}
