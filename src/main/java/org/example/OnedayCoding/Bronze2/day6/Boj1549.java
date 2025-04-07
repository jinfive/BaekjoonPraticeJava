package org.example.OnedayCoding.Bronze2.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1549 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result;
        String [] arr = s.split("-");
        String[] arrPlus ={};
        String[] arrg ={};
        int sum = 0;
        int g = 0;
        arrg = arr[0].split("\\+");
        for(int j = 0 ; j < arrg.length ; j++){
            g += Integer.parseInt(arrg[j]);

        }
        for(int i = 1 ; i < arr.length ; i++){
            //System.out.println(arr[i]);

            arrPlus =  arr[i].split("\\+");
            for(int j = 0 ; j < arrPlus.length ; j++){
                sum += Integer.parseInt(arrPlus[j]);

            }

        }
        System.out.println(g - sum);



    }
}
