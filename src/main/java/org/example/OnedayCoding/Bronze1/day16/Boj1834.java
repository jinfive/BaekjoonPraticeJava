package org.example.OnedayCoding.Bronze1.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boj1834 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            ArrayList<Long> myList = new ArrayList<>();
            for(int i = 1 ; i < n ; i++){
                myList.add((long)n * i + i);
            }
            long sum=0l;
            for(long a :myList){
                sum += a;
            }
            System.out.println(sum);

        }
    }
}
