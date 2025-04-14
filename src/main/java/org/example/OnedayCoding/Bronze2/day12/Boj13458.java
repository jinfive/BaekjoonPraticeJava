package org.example.OnedayCoding.Bronze2.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13458 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] classes = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            classes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken()); //총감
        int c = Integer.parseInt(st.nextToken()); //부감

        for(int i = 0 ; i < classes.length ; i++){
            classes[i] -= b;
        }

        Long answer =(long) n ;// 총감 수

        for(int i = 0 ; i < classes.length ; i++){
            int count = 0;
            if(classes[i] > 0){
                if((classes [i] % c) == 0 ) {
                    count = classes [i] / c;
                }
                else{
                    count = classes [i] / c +1;
                }

            }
            answer += (long)count;
        }

        System.out.println(answer);




    }

}
