package org.example.OnedayCoding.Bronze1.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14467 {


    // The main method must be in a class named "Main".
    class Main {


        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cowArr = new int[11];
            for(int i = 0 ; i < cowArr.length ; i++){
                cowArr[i] = -1;
            }
            int answer = 0;
            int test = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < test ; i ++){
                st = new StringTokenizer(br.readLine());
                int cowN = Integer.parseInt(st.nextToken());
                int loc = Integer.parseInt(st.nextToken());
                if(cowArr[cowN] == -1){
                    cowArr[cowN] = loc;
                }
                else if(cowArr[cowN] != loc){
                    answer ++;
                    cowArr[cowN] = loc;
                }
            }
            System.out.println(answer);


        }
    }
}
