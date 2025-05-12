package org.example.OnedayCoding.Bronze1.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2810 {
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // String str = "SLLLLSSLL";
            // String res = str.replaceAll("LL","S");
            // System.out.println(res);
            int cup = 0;
            int people = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String reStr = str.replaceAll("LL","S");
            cup = reStr.length()+1;
            if(people>=cup){
                System.out.println(cup);
            }else{
                System.out.println(people);
            }


        }
    }
}
