package org.example.OnedayCoding.Bronze4.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int science1 = Integer.parseInt(br.readLine());
        int science2 = Integer.parseInt(br.readLine());
        int science3 = Integer.parseInt(br.readLine());
        int science4 = Integer.parseInt(br.readLine());
        int social1 = Integer.parseInt(br.readLine());
        int social2 = Integer.parseInt(br.readLine());

        int [] science = new int[4];
        int [] social = new int[2];
        science[0] = science1;
        science[1] = science2;
        science[2] = science3;
        science[3] = science4;
        social[0] = social1;
        social[1] = social2;
        Arrays.sort(science);
        Arrays.sort(social);
        int sum = science[3]+science[1]+science[2]+social[1];
//        for(int i = 0 ;i<science.length;i++){
//            System.out.println(science[i]);
//        }
//        for(int i = 0 ;i<social.length;i++){
//            System.out.println(social[i]);
//        }
        System.out.println(sum);
        br.close();
    }
}
