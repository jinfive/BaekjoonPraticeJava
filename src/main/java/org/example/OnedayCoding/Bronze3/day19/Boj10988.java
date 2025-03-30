package org.example.OnedayCoding.Bronze3.day19;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;

public class Boj10988 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        String str = br.readLine();
        for (int i = str.length()-1 ; i>=0 ; i --){
            answer += str.charAt(i);
        }
        if(answer.equals(str)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
