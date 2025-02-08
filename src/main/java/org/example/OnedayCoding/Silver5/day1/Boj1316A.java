package org.example.OnedayCoding.Silver5.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1316A {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < N; i++) {
        int[] check = new int[26]; // a 가 들어오면 0 번째 체크 z가 들어오면 25번째 체크
        char[] text = br.readLine().toCharArray();
        char before = text[0];
        check[(int)(before - 'a')] =1;

        boolean flag = true;
        for (int j = 1; j < text.length; j++) {
            char now = text[j];
            if(before != now && check[(int)(now - 'a')] == 1){
                flag = false;
                break;
            }
            before = now;
            check[(int)(before - 'a')] = 1;
        }
        if(flag){
            count++;
        }
    }
        System.out.println(count);
        //System.out.println((int)'a'); 97
        //System.out.println((int)'z'); 122
//        for (int i = 1; i <= n; i++) {
//            System.out.println(arr[i]);
//        }

    }
}
