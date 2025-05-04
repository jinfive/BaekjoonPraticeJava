package org.example.OnedayCoding.Bronze1.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj4796 {
  
    class Main {
        public static void main(String[] args) throws Exception{
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int caseCount = 1;
            while(true){
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                if(l == 0 && p == 0 && v == 0){
                    break;
                }

                int full_periods = v / p;        // 전체 기간에서 P일로 나눈 몫
                int remaining_days = v % p;      // 남은 일수
                int camping_days = full_periods * l + Math.min(remaining_days, l);

                sb.append("Case " + caseCount + ": " + camping_days + '\n');
                caseCount++;
            }
            System.out.println(sb);
        }
    }

}
