package org.example.OnedayCoding.Bronze2.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj25501 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            for(int i = 0 ; i < n ; i++){
                int count =1;
                String str  = br.readLine();
                int start = 0 ;
                int end = str.length()-1;
                boolean flag =true;
                while(start < end){
                    if(str.charAt(start) == str.charAt(end)){
                        count++;
                        start++;
                        end--;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(1 +" " + count);
                }
                else{
                    System.out.println(0 +" " + count);
                }

            }

        }
    }
}
