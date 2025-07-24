package org.example.OnedayCoding.Silver4.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1049 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            int packageMin = Integer.MAX_VALUE;
            int soloMin = Integer.MAX_VALUE;
            int answer = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int broken = Integer.parseInt(st.nextToken());
            int brand = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < brand ; i++){
                st = new StringTokenizer(br.readLine());
                int packageMoney = Integer.parseInt(st.nextToken());
                int soloMoney = Integer.parseInt(st.nextToken());
                soloMin = Math.min(soloMin, soloMoney);
                packageMin = Math.min(packageMoney, packageMin);
            }
            // System.out.println(soloMin);
            // System.out.println(packageMin);
            while(broken > 5){

                if(soloMin * 6 > packageMin){
                    answer += packageMin;

                    broken -= 6;
                }
                else{
                    answer = (soloMin * broken);
                    broken = 0;
                }
            }
            if(broken < 6){
                if(soloMin * broken > packageMin){
                    answer += packageMin;

                    broken = 0;
                }
                else{
                    answer += broken * soloMin;
                }

            }
            System.out.println(answer);
        }
    }
}
