package org.example.OnedayCoding.Bronze2.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj1427 {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] cArr = str.toCharArray();
        List<Integer> list = new ArrayList<>();

        for(char c : cArr){
            list.add(c - '0');
        }

        Collections.sort(list , Collections.reverseOrder());

        for(int i : list){System.out.print(i);}



    }
}
