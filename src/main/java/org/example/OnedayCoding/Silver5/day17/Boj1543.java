package org.example.OnedayCoding.Silver5.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1543 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int answer = 0;
            String str = "apple";

            System.out.println(str.substring(0,5));//ple출력
            String file = br.readLine();
            String findStr = br.readLine();
            for(int i = 0 ; i < file.length() ;){

                if(i + findStr.length() <= file.length() && file.substring(i, i + findStr.length()).equals(findStr)){
                    answer++;
                    i += findStr.length();
                }
                else{
                    i++;
                }
            }
            System.out.println(answer);

        }
    }
}
