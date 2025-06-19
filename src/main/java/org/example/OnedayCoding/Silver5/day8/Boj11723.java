package org.example.OnedayCoding.Silver5.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj11723 {

    // The main method must be in a class named "Main".
    class Main {
        private static Map<Integer, Integer> hash;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] s = new int[21];
            int M = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                String com  = st.nextToken();
                int x = -1;
                switch (com) {
                    case "add":
                        x = Integer.parseInt(st.nextToken());
                        s[x] =1;
                        break;
                    case "remove":
                        x = Integer.parseInt(st.nextToken());
                        s[x] = 0;
                        break;
                    case "check":
                        x = Integer.parseInt(st.nextToken());
                        System.out.println(s[x]);
                        break;
                    case "toggle":
                        x = Integer.parseInt(st.nextToken());
                        s[x] = (s[x] + 1 ) % 2;
                        break;
                    case "all":
                        Arrays.fill(s,1);
                        break;
                    case "empty":
                        Arrays.fill(s,0);
                        break;


                }
            }

        }
    }
}
