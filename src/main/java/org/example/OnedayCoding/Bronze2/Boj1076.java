package org.example.OnedayCoding.Bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj1076 {

        public static void main(String[] args) throws Exception{
            Map<String, int[]> hash = new HashMap<>();
            hash.put("black",  new int[]{0, 1});
            hash.put("brown",  new int[]{1, 10});
            hash.put("red",    new int[]{2, 100});
            hash.put("orange", new int[]{3, 1000});
            hash.put("yellow", new int[]{4, 10000});
            hash.put("green",  new int[]{5, 100000});
            hash.put("blue",   new int[]{6, 1000000});
            hash.put("violet", new int[]{7, 10000000});
            hash.put("grey",   new int[]{8, 100000000});
            hash.put("white",  new int[]{9, 1000000000});

            long sum = 0; // long 타입 소문자 권장
            String sexy = "";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i = 1 ; i <= 3 ; i++){
                String str = br.readLine();
                if(i == 3){
                    int[] numArr = hash.get(str);
                    sum += Long.parseLong(sexy); // sexy를 long으로 변환
                    sum *= (long)numArr[1];      // numArr[1]을 long으로 변환
                }
                else{
                    int[] numArr = hash.get(str);
                    sexy += numArr[0];
                }
            }
            System.out.println(sum);
        }
    

}
