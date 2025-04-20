package org.example.OnedayCoding.Bronze2.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1075 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] arr = br.readLine().toCharArray();
            int f = Integer.parseInt(br.readLine());

            arr[arr.length - 2] = '0';
            arr[arr.length - 1] = '0';

            String str = "";
            for(int i = 0 ; i < arr.length ; i++){
                str += arr[i]+"";
            }

            int n = Integer.parseInt(str);
            // System.out.println(str);

            while(n % f != 0){
                n++;
            }
            // System.out.println(n);
            System.out.print((n+" ").charAt(str.length()-2));
            System.out.print((n+" ").charAt(str.length()-1));



        }
    }
}
