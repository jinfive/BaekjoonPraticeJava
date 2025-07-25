package org.example.OnedayCoding.Silver4.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9327 {
 

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            StringBuilder sb = new StringBuilder();
            int test = Integer.parseInt(st.nextToken());
            for(int tc = 0 ; tc < test ; tc++){
                st = new StringTokenizer(br.readLine());
                int city = Integer.parseInt(st.nextToken());
                int airPlan = Integer.parseInt(st.nextToken());
                for(int i = 0 ; i < airPlan ;i++){
                    br.readLine();
                }
                sb.append(city - 1 +"\n");
            }
            System.out.println(sb.toString());
        }
    }
}
