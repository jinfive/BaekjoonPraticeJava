package org.example.OnedayCoding.Bronze2.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Boj1152 {


    // The main method must be in a class named "Main".

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;
        List<String> list = Arrays.asList(s.split(" "));
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isEmpty()) {
                count++;
            }
        }
        System.out.println(count);


    }
}
