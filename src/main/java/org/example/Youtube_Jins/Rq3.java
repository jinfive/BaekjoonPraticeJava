package org.example.Youtube_Jins;

import java.util.Arrays;
import java.util.Scanner;

public class Rq3 {
    /*최빈수 구하기
    1 2 2 3 1 4 2 2 4 3 5 3 2
    정답 2 5회
     */
    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] numarr = num.split(" ");
        int [] arr = new int[numarr.length];
        for(int i = 0;i<numarr.length;i++){
            arr[i] =Integer.parseInt(numarr[i]);
        }

        int []mode = new int[numarr.length+1];

        for(int i = 0;i<numarr.length;i++){
            mode[arr[i]]++;
        }

        int max = mode[1];
        int maxV = 0;
        for(int i = 2;i<mode.length;i++){
            if(mode[i]>max){
                max = mode[i];
                maxV = i;
            }
        }
        System.out.println(maxV+"가"+max+"출현");
        sc.close();
    }
}

