package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOj2941_1 {


    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String check1 = "dz=";
            String[] check2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
            String text = br.readLine();
            int count = 0;

            for(int i = 0; i < text.length(); ){
                if(i < text.length() - 2 && check1.equals(text.substring(i, i+3))){
                    count++;
                    i += 3;
                }
                else if(i < text.length() - 1){
                    boolean match = false;
                    String now = text.substring(i, i+2);
                    for(int j = 0; j < check2.length; j++){
                        if(check2[j].equals(now)){
                            count++;
                            i += 2;
                            match = true;
                            break;
                        }
                    }
                    if(!match){
                        count++;
                        i++;
                    }
                }
                else {
                    count++;
                    i++;
                }
            }

            System.out.println(count);
        }
    }

}
