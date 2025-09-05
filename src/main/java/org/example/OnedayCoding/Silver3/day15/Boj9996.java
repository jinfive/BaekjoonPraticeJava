package org.example.OnedayCoding.Silver3.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj9996 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] arr = str.split("\\*");
            // for(int i = 0 ; i < arr.length ; i++){
            //     System.out.println(arr[i]);
            // }

            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < n ; i++){
                String input = br.readLine();
                if(input.length() < arr[0].length() + arr[1].length()){
                    sb.append("NE\n");
                }
                else if(input.startsWith(arr[0]) && input.endsWith(arr[1])){
                    sb.append("DA\n");
                }
                else{
                    sb.append("NE\n");
                }
            }
            System.out.print(sb.toString());
        }
    }
}
