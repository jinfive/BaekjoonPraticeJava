package org.example.OnedayCoding.Bronze3.day8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st1.nextToken());
        int y2 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st2.nextToken());
        int y3 = Integer.parseInt(st2.nextToken());

        if(x1 == x2 ){
            System.out.print(x3+" ");
        }
        else if(x1 == x3){
            System.out.print(x2+" ");
        }
        else if(x2 == x3){
            System.out.print(x1+" ");
        }

        if(y1 == y2 ){
            System.out.print(y3+" ");
        }
        else if(y1 == y3){
            System.out.print(y2+" ");
        }
        else if(y2 == y3){
            System.out.print(y1+" ");
        }
        br.close();



    }
}
