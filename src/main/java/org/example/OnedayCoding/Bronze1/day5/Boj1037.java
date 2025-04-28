package org.example.OnedayCoding.Bronze1.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1037 {


    // The main method must be in a class named "Main".
    class Main {
        private static int [] Arr;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            Arr = new int[n];
            if(n == 1){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                System.out.println(a * a);
            }
            else{
                String str = br.readLine();
                String[] arr = str.split(" ");
                int[] numArr = new int[arr.length];
                for(int i = 0 ; i < arr.length ; i++){
                    numArr[i] = Integer.parseInt(arr[i]);
                }
                Arrays.sort(numArr);
                int a = (numArr[0]);
                int b = (numArr[numArr.length - 1]);
                System.out.println(a * b);
            }


        }
    }
}
