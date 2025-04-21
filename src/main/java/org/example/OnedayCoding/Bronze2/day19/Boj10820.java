package org.example.OnedayCoding.Bronze2.day19;

import java.util.Scanner;

public class Boj10820 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                char[] arr = sc.nextLine().toCharArray();
                int[] answer = new int[4]; // 소문자, 대문자, 숫자, 공백

                for(char c : arr){
                    // 소문자
                    if(c >= 'a' && c <= 'z'){
                        answer[0]++;
                    }
                    // 대문자
                    else if(c >= 'A' && c <= 'Z'){
                        answer[1]++;
                    }
                    // 숫자
                    else if(c >= '0' && c <= '9'){
                        answer[2]++;
                    }
                    // 공백
                    else if(c == ' '){
                        answer[3]++;
                    }
                }

                // 소문자, 대문자, 숫자, 공백 순서로 출력
                System.out.println(answer[0] + " " + answer[1] + " " + answer[2] + " " + answer[3]);
            }
        }
    }

}
