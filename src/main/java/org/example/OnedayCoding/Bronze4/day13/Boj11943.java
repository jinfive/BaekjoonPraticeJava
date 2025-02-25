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

        int b1 = A + B;
        int b2 = C + D;

        int count = 0;

        if(A>B){
            count += B;
            count += A;
            System.out.println(count);
        }
        else if(B>A){
            count += A;
            count += D;
            System.out.println(count);
        }
        else{
            if(C>D){
                count += D;
                count += A;
                System.out.println(count);
            }
            else{
                count += C;
                count += B;
                System.out.println(count);
            }

        }

    }
}
