package org.example.OnedayCoding.Silver3.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2458 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] streetArr= new int[n - 1];
            int[] arr = new int [n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            for(int i = 1 ; i < n ; i++){
                streetArr[i - 1] = arr[i] - arr[i - 1];

            }
            int gcdNum = streetArr[0];
            for(int i = 1; i < n - 1; i++){
                gcdNum = gcd(streetArr[i] , gcdNum);
            }
            int answer = 0;
            for(int i = 0; i < n - 1; i++){
                answer += ((streetArr[i] / gcdNum) - 1);
            }

            System.out.println(answer);

        }
        private static int gcd(int a, int b){
            if(a % b == 0){
                return b;
            }
            return gcd(b, a % b);
        }
    }
}
