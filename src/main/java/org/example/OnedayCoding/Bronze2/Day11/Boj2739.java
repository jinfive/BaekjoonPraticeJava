package org.example.OnedayCoding.Bronze2.Day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Boj2739 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        IntStream.rangeClosed(1,9).forEach(j ->{
            System.out.println(n + " " +"*" + " " + j +" = " + (n *j) );
        });
    }
}
