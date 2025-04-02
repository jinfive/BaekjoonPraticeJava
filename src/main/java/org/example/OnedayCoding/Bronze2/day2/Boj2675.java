package org.example.OnedayCoding.Bronze2.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2675 {


    // The main method must be in a class named "Main".

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    result += str.charAt(j);
                }
            }
            System.out.println(result);
        }


    }

}
