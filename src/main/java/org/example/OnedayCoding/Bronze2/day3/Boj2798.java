package org.example.OnedayCoding.Bronze2.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2798 {


    // The main method must be in a class named "Main".


        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int [] A = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i  < n ; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }

            int Max = -1;
            for(int i = 0 ; i < n ;i++){
                for(int j = i+1 ; j < n ;j++){
                    for(int k = j+1 ; k < n ;k++){
                        int temp =  A[i] + A[j] +A[k] ;
                        if(Max < temp && m >= temp){
                            Max = temp;
                        }
                    }
                }
            }
            System.out.println(Max);


        
    }


}
