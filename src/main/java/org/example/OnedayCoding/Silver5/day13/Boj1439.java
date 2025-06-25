package org.example.OnedayCoding.Silver5.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1439 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] parent;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] cArr = br.readLine().toCharArray();
            int count = 0;
            char startChar = cArr[0];
            for(int i = 1 ; i < cArr.length ; i++){
                if(startChar != cArr[i] && cArr[i] != cArr[i-1]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
