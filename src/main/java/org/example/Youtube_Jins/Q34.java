package org.example.Youtube_Jins;

public class Q34 {
    /*
    입력된 항의 피보나치 수를 구하시오>>>6 (재귀 이용)
정답: 8
     */
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }//if
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(6));
    }
}
