package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2607_1 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            String standard = br.readLine();
            int answer = 0;
            for(int test = 1 ; test < testCase ; test++){
                String str = br.readLine();
                int cnt = 0;
                int[] alphabet = new int[26];

                for(int i = 0 ; i < standard.length() ; i++){
                    alphabet[(int)standard.charAt(i) - 'A']++;
                }

                for(int i = 0 ; i < str.length() ; i++){
                    if( alphabet[(int)str.charAt(i) - 'A'] > 0){
                        cnt++;
                        alphabet[(int)str.charAt(i) - 'A']--;
                    }
                }
                if(str.length() == standard.length() && (cnt == standard.length() || standard.length() -1 == cnt)){//문자열 길이가 같은경우
                    answer++;
                }
                else if(str.length() == standard.length() -1 && cnt == standard.length() -1){//스텐다드가 더 긴경우
                    answer++;
                }
                else if(str.length() -1 == standard.length() && cnt == str.length() -1){//스텐다드가 더 긴경우
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
