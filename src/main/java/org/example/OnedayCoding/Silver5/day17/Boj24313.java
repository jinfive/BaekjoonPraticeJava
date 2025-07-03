package org.example.OnedayCoding.Silver5.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj24313 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 1;
            int a1 = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            int c = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for(int i = n ; i < 100 ; i++){
                if((a1 * i + a  > c *i)){
                    answer = 0;
                    break;
                }
            }

            System.out.println(answer);

        }
    }
}
