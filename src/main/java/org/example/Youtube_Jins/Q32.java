package org.example.Youtube_Jins;

public class Q32 {
    // 입력된 두 수 까지의 합을 구하시오 재귀함수 이용
    static  int sum  = 0;
    public static void main(String[] args) {
        System.out.println(sum(1,4));
    }
    public static int sum(int a , int b){
        if (a == b){
            return b;
        }
        return a + sum(a+1,b);


    }
}
