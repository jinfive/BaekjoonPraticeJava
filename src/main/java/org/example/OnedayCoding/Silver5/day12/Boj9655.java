package org.example.OnedayCoding.Silver5.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9655 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{

            StringBuilder sb= new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int count = 0;
            while(n != 0){
                if(n >= 3){
                    n = n -3;
                    count++;

                }
                else{
                    n = n -1;
                    count++;

                }
            }

            if(count % 2 == 1){
                System.out.println("SK");
            }
            else{
                System.out.println("CY");
            }

        }
    }
}
