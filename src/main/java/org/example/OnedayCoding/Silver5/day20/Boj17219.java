package org.example.OnedayCoding.Silver5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj17219 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Map<String, String> pwMap = new HashMap<>();
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                String site = st.nextToken();
                String pw = st.nextToken();
                pwMap.put(site, pw);
            }

            for(int i = 0 ; i < m ; i++){
                String find = br.readLine();
                sb.append(pwMap.get(find) +"\n");
            }
            System.out.println(sb.toString());
        }
    }
}
