package org.example.OnedayCoding.Bronze1.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj1259 {

    // The main method must be in a class named "Main".
    class Main {
        private static int n;
        private static int depth = 0;
        private static boolean[] visited;
        private static int answer = 0;
        private static ArrayList<Integer>[] A;
        public static void main(String[] args) throws Exception{
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String s = br.readLine();
                if(s.equals("0")) break;
                char[] arr = s.toCharArray();
                int start = 0 ;
                int end = arr.length -1;
                boolean flag = true;
                while(start < end){
                    if(arr[start] != (arr[end])){
                        flag = false;
                        break;
                    }
                    start++;
                    end--;
                }

                System.out.println(flag ? "yes" : "no");
            }
        }
    }
}
