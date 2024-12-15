package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q44_A {
    /*
    백준11054
    예제 입력 1
    10
    1 5 2 1 4 3 4 5 2 1
    예제 출력 1
    7
    힌트
    예제의 경우 {1 5 2 1 4 3 4 5 2 1}이 가장 긴 바이토닉 부분 수열이다.
        1  5  2  1  4  3  4  5  2  1
    dpH 1  2  2  1  3  3  4  5  2  1
    dpl  1  5  2  1  4  3  3  3  2  1
    sum  2  7  4  2  7  6  7  8  4  2
     */
    public static int getMax(int a , int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int cnt = sc.nextInt();
        int input[] = new int[cnt];
        for(int i = 0; i<cnt; i++){
            input[i] = sc.nextInt();
        }
        int[] dph = new int[cnt];
        int[] dpl = new int[cnt];

        for(int i = 0; i<cnt; i++){
            dph[i] = 1;
            dpl[i] = 1;
        }//초기화

        for(int i = 1; i<cnt; i++){
            for(int j = i; j>=0; j--){
                if(input[i]>input[j]){
                    dph[i] = getMax(dph[i],dph[j]+1);
                }//if
            }//for
        }//for

        for(int i = cnt-1; i>=0; i--){
            for(int j = i; j<cnt; j++){
                if(input[i]>input[j]){
                    dpl[i] = getMax(dpl[i],dpl[j]+1);
                }//if
            }//for
        }//for

        int max = 0;
        for(int i = 0; i<cnt; i++){
            if(max<dph[i]+dpl[i]){
                max = dph[i]+dpl[i];
            }
        }
        System.out.println(max-1);
    }//main

}//class
