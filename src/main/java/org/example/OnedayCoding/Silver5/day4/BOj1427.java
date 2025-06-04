package org.example.OnedayCoding.Silver5.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOj1427 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            String[] strArr = new String[str.length()];
            for(int i = 0 ; i < str.length() ; i++){
                strArr[i] = str.charAt(i)+"";
            }
            Arrays.sort(strArr, Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < strArr.length ; i++){
                sb.append(strArr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
