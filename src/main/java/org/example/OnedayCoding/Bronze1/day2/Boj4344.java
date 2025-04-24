package org.example.OnedayCoding.Bronze1.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj4344 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            int testCase = Integer.parseInt(br.readLine());

            for(int i = 0 ; i < testCase ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int sum = 0;
                // n개의 숫자 읽기
                int [] p = new int[n];
                for(int j=0; j<n; j++){
                    p[j] = Integer.parseInt(st.nextToken());
                    sum += p[j];
                }

                double avg = (double)sum / n;

                int overAvg = 0;
                // System.out.println(avg);
                for(int j=0; j<n; j++){
                    if(avg <  p[j]){
                        overAvg++;
                    }
                }
                System.out.println(Math.round(overAvg/(double)n * 100 * 1000)/1000.0 +"%");
            }


        }
    }
}
