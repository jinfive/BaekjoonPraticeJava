package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q40_A재귀 {
    /*
    백준1463번
    정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

입력
첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.

출력
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

예제 입력 1
2
예제 출력 1
1

예제 입력 2
10
예제 출력 2
3
     */

    static int min = 999999;

    public static void doFunc(int num, int way, int cnt) {
        if (way == 3 && num % 3 == 0) {
            cnt++;
            num /= way;
            for (int i = 1; i <= 3; i++)
                doFunc(num, i, cnt);
        } else if (way == 2 && num % 2 == 0) {
            cnt++;
            num /= way;
            for (int i = 1; i <= 3; i++)
                doFunc(num, i, cnt);
        } else if (num >= 2){
            cnt++;
            num -= 1;
            for (int i = 1; i <= 3; i++)
                doFunc(num, i, cnt);
        }

        if (num == 1 && cnt < min) {
            min = cnt;
            return;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= 3; i++)
            doFunc(n, i, 0);
        System.out.println(min);
    }
}

