package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj27962 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            //System.out.println("Hello world!");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            boolean flag = true;
            for(int i = 1 ; i <= n ; i++ ){
                String a = str.substring(0, i);
                String b = str.substring(n-i , n);
                int count = 0 ;
                for(int j = 0 ; j < i ; j++){
                    if(a.charAt(j) != b.charAt(j)){
                        count++;
                        if(count > 1){
                            break;
                        }
                    }
                }
                if (count == 1){
                    System.out.println("YES");
                    return;
                }

            }

            System.out.println("NO");


        }
    }
}
