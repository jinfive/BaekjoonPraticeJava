package org.example.OnedayCoding.Bronze1.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1145 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int index = 1;

            while(true){
                int count = 0;
                if(index % a == 0 ){
                    count++;
                }
                if(index % b == 0){
                    count++;
                }
                if(index % c == 0){
                    count++;
                }
                if(index % d == 0){
                    count++;
                }
                if(index % e == 0){
                    count++;
                }
                if(count >= 3){
                    System.out.println(index);
                    break;
                }
                index++;
            }
        }
    }
}
