package org.example.OnedayCoding.Bronze4.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2083 {
    //나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부 || 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){


            String input = br.readLine();
            String[] split = input.split(" ");
            if(split[0].equals("#") && split[1].equals("0")){
                break;
            }
            if(Integer.parseInt(split[1]) > 17 ||Integer.parseInt(split[2]) > 80 ){
                System.out.println(split[0] +" Senior");
            } else if (Integer.parseInt(split[1]) <= 17 && Integer.parseInt(split[2]) <= 80) {
                System.out.println(split[0] +" Junior");
            }

        }
        br.close();
    }
}
