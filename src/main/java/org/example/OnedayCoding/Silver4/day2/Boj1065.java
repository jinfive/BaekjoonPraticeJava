package org.example.OnedayCoding.Silver4.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1065 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            for(int i = 1 ; i <= n ; i++){
                String str = i +"";
                if(str.length() == 1){
                    answer++;
                }
                else if(str.length() == 2){
                    answer++;
                }
                else{
                    int before = 0;
                    boolean flag = true;
                    for(int j = 0 ; j < str.length() - 1; j++){
                        int k = j + 1;
                        int first = str.charAt(j) - '0';
                        int second = str.charAt(k) - '0';
                        if(j == 0){
                            before = second - first;
                        }
                        else{
                            if(before != second - first){
                                flag = false;
                                break;
                            }
                        }
                    }
                    if(flag){
                        answer++;
                    }

                }
            }
            System.out.println(answer);
        }
    }
}
