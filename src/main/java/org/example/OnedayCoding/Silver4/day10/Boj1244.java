package org.example.OnedayCoding.Silver4.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1244 {


    // The main method must be in a class named "Main".
    class Main {

        private static int[] switchArr;
        private static int num;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            switchArr = new int[num + 1];
            st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= num ; i++){
                switchArr[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            int test = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < test ; i++){
                st = new StringTokenizer(br.readLine());
                int gender = Integer.parseInt(st.nextToken());
                int number = Integer.parseInt(st.nextToken());
                if(gender == 1 ){
                    man(number);
                }
                else{
                    woman(number);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= num; i++){
                sb.append(switchArr[i]);
                if(i < num) sb.append(" ");

                // 20개마다 줄바꿈 (마지막 줄 제외)
                if(i % 20 == 0 && i < num){
                    System.out.println(sb.toString());
                    sb = new StringBuilder();
                }
            }
            // 남은 스위치들 출력
            if(sb.length() > 0){
                System.out.println(sb.toString());
            }
        }
        private static void man(int number){
            for(int i = number ; i <= num ; i++){
                if(i % number == 0){
                    if(switchArr[i] == 1){
                        switchArr[i] = 0;
                    }
                    else{
                        switchArr[i] = 1;
                    }
                }
            }
        }

        private static void woman(int number){
            int point1 = number;//뒤로
            int point2 = number;//앞으로
            while(point1 >= 1 && point2 <= num){
                if(switchArr[point1] == switchArr[point2]){
                    if(switchArr[point1] == 1){
                        switchArr[point1--] = 0;
                        switchArr[point2++] = 0;

                    }
                    else{
                        switchArr[point1--] = 1;
                        switchArr[point2++] = 1;
                    }
                }
                else{
                    return;
                }
            }
        }
    }
}
