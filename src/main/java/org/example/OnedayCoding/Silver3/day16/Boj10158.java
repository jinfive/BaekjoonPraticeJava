package org.example.OnedayCoding.Silver3.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10158 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(br.readLine());
            int answerX = 0;
            int answerY = 0;
            if((x + time) % (2 * w) > w){
                answerX = w - ((x + time) % (2 * w) - w);
            }
            else{
                answerX = (x + time) % (2 * w);
            }

            if((y + time) % (2 * h) > h){
                answerY = h - ((y + time) % (2 * h) - h);
            }
            else{
                answerY = (y + time) %(2 * h) ;
            }
            System.out.println(answerX + " " + answerY);
        }
    }
}
