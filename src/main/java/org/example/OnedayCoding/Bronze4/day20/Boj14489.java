package org.example.OnedayCoding.Bronze4.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        int sum = a + b;

        if(sum > n *2){
            System.out.println(sum - n *2);
        }
        else{
            System.out.println(sum);
        }
        br.close();
    }
}
