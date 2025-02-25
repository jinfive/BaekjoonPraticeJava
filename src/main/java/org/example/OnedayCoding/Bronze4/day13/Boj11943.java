package org.example.OnedayCoding.Bronze4.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st2.nextToken());
        int D = Integer.parseInt(st2.nextToken());

        // System.out.println(A +""+B+""+C+""+D);

        int c1 = B + C;
        int c2 = A + D;

        if(c1 > c2){
            System.out.println(c1);
        }
        else{
            System.out.println(c2);
        }

    }
}
