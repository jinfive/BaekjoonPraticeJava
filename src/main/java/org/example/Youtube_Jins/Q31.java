package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q31 {
    //재귀함수를 이용한 펙토릴얼을 구하오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요~");
        int n = sc.nextInt();
        System.out.println(f(n));
        sc.close();


    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        return  n * f(n-1);
    }

}
