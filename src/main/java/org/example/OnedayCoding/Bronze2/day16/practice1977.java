package org.example.OnedayCoding.Bronze2.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class practice1977 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = n; i <= m; i++) {
            int sexy = (int) Math.sqrt(i);
            // System.out.println(i + " "+sexy);
            if (sexy * sexy == i) {
                list.add(i);
            }
        }
        // System.out.println(list.toString());

        if (list.size() > 0) {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println(-1);
        }


    }
}

