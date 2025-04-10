package org.example.OnedayCoding.Bronze2.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj2581 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int [] A = new int[n+1];

        for(int i = 2 ; i < A.length ; i++){
            A[i] = i;

        }

        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(A[i] == 0) continue;
            for(int j = i + i ; j <= n ; j = j + i){
                A[j] = 0;
            }
        }
        int sum = 0;

        List<Integer> list = new ArrayList<>();
        for(int i = m ; i <= n ; i++){
            if(A[i] != 0){ sum += A[i];
                list.add(A[i]);
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }

    }
}
