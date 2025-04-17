package org.example.OnedayCoding.Bronze2.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj15829 {
    public static void main(String[] args) throws Exception{
        //System.out.println((long)'a' - 96);//97
        long k = 31;
        Long m =1234567891l;
        long answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char[] arr = str.toCharArray();

        for(int i = 0 ;i < arr.length ; i++){
            //System.out.println((long)arr[i] - 96);//97
            // answer = answer + (long)((arr[i]-96) * Math.pow(k,i));
            long v = (long)(arr[i]-96);
            long a = 1;
            for(int j = 0 ; j < i ; j++){
                a = (a * k) % m;
            }
            answer += v * a % m;

        }

        System.out.println(answer % m);





    }
}
