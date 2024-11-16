package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q39 {
    /*
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

예제입력:
4
7
10
출력
7
44
274
벡준9095

----------점화식
1  =1 ==>1가지

2 ==>2가지
1+1
2

3 ==>4가지
1+1+1
1+2
2+1
3

4 ==>7가지
1+1+1+1
1+2+1
2+1+1
1+1+2
1+3
3+1
4

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요");
        int n = sc.nextInt();





    }
}
