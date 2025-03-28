package org.example.OnedayCoding.Bronze3.day17;
import java.util.*;
import java.io.*;

public class Boj2576 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < 7 ; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int sum = 0;
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) % 2 == 1){
                sum += list.get(i);
                list1.add(list.get(i));
            }
        }
        System.out.println(sum);
        System.out.println(list1.get(0));
    }
}
