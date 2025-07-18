package org.example.OnedayCoding.Silver4.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj17219 {

    // The main method must be in a class named "Main".
    class Main {
        private static Map<String, String> pwMap;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            pwMap = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                String site = st.nextToken();
                String pw = st.nextToken();
                pwMap.put(site, pw);
            }
            for(int i = 0 ; i < m ; i++){
                sb.append(pwMap.get(br.readLine()));
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
