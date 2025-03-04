package org.example.OnedayCoding.Bronze4.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // a + b  = x
        // a - b == y
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if( M > N ){
            System.out.println(-1);
        }
        else{
            int x = (N + M ) /2;
            int y = (N - M ) % 2;
            if(x+y == N && x - y == M){
                System.out.println(x + " " + y);
            }
            else{
                System.out.println(-1);
            }
        }


    }
}
