package org.example.OnedayCoding.Silver4.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10610 {


    // The main method must be in a class named "Main".
    class Main {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String n = br.readLine();
            char[] arr = n.toCharArray();
            int sum= 0;
            boolean zeroFlag =false;
            for(int i = 0 ; i  < arr.length ; i++){
                sum += (arr[i] -'0');
                if(arr[i] == '0'){
                    zeroFlag = true;
                }
            }
            if(!zeroFlag){
                System.out.println("-1");
                return;
            }
            if(sum % 3 != 0){
                System.out.println("-1");
                return;
            }
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for(int i = arr.length - 1 ; i >= 0 ; i--){
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
