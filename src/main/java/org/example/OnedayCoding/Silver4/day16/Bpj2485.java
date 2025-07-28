package org.example.OnedayCoding.Silver4.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bpj2485 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            //System.out.println(gcd(15,2));
            int[] street = new int[num];
            for(int i = 0 ; i < num ; i++){
                street[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(street);
            int[] dif = new int[num - 1];
            for(int i = 0 ; i < num - 1; i++){
                dif[i] = street[i + 1] - street[i];
            }
            Arrays.sort(dif);
            int difNum = dif[0];
            for(int i = 1; i < dif.length; i++){
                difNum = gcd(difNum, dif[i]);
            }

            int answer = 0 ;
            for(int i = 0 ; i < dif.length ; i++){
                answer += dif[i] / difNum - 1;
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
