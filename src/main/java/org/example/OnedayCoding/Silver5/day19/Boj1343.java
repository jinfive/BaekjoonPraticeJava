package org.example.OnedayCoding.Silver5.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1343 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for(int i = 0 ; i < str.length() ;i++){
                if(str.charAt(i) == 'X'){
                    count++;
                }
                else{
                    if(count > 0){
                        if(count % 2 != 0){
                            System.out.println("-1");
                            return;  // 프로그램 종료

                        }
                        while(count != 0){
                            if(count>=4){
                                sb.append("AAAA");
                                count -= 4;
                            }
                            else{
                                sb.append("BB");
                                count -= 2;
                            }
                        }
                    }
                    count = 0;
                    sb.append(str.charAt(i));
                }
            }
            if(count > 0){
                if(count % 2 != 0){
                    System.out.println("-1");
                    return;  // 프로그램 종료

                }
                while(count != 0){
                    if(count>=4){
                        sb.append("AAAA");
                        count -= 4;
                    }
                    else{
                        sb.append("BB");
                        count -= 2;
                    }
                }

            }
            System.out.println(sb.toString());

        }
    }
}
