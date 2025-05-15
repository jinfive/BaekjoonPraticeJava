package org.example.OnedayCoding.Bronze1.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1526 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for(; n > 3 ; n--){
                String now = n+"";
                boolean flag = false;
                for(int i = 0 ; i < now.length() ; i++){
                    if(now.charAt(i) == '7' || now.charAt(i) == '4'){
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(n);
                    break;
                }
            }

        }
    }
}
