package org.example.OnedayCoding.Bronze5.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            if(s.length()>1){
                System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
            }
            else{
                System.out.println(s.charAt(0)+""+s.charAt(0));
            }
        }//for
    }
}
