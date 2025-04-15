package org.example.OnedayCoding.Bronze2.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1009 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int computer = 10;

        for(int i = 1 ;  i <= t ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a % 10;

            for(int j = 1 ; j <=  b -1 ;j ++){
                result = (result * a ) % 10;

            }
            if(result == 0){
                System.out.println(10);
            }
            else{
                System.out.println(result);
            }
        }
    }
}
