package org.example.OnedayCoding.Bronze1.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11170 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int test = Integer.parseInt(st.nextToken());
            for(int t = 0 ; t < test ; t++){
                int count = 0;
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                for(; start <= end ; start++){
                    String now = start+"";
                    if(now.contains("0")){
                        for(int i = 0 ; i < now.length() ; i++){
                            if(now.charAt(i) == '0'){
                                count++;
                            }
                        }
                    }
                }
                System.out.println(count);
            }

        }
    }
}
