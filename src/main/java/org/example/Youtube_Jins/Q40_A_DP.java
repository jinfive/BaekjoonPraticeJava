package org.example.Youtube_Jins;

import java.util.Scanner;

import static java.lang.Math.min;

public class Q40_A_DP {
    /*
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
    static int[] arr = new int[1000000];

    public static void main(String[] args) {
        arr[2] = 1; //2  => -1  /2
        arr[3] = 1; // 3 => -1 /2 , /3
        //arr[4] =2 => -1 +arr[3]
        //arr[5] =3 => -1 + arr[4]
        //arr[6] =2  => /3 /2
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 4; i < arr.length; i++) {
            int a = 999999;
            int b = 999999;
            int c = 999999;
            for (int w = 1; w <= 3; w++) {
                if (w == 1) {
                    a = arr[i - 1];
                }//if
                else if (w == 2) {
                    if (i % 2 == 0) {
                        b = arr[i / 2];
                    }
                } else if (w == 3) {
                    if (i % 3 == 0) {
                        c = arr[i / 3];
                    }
                }
            }//for
            int min = Math.min(Math.min(a, b), c);
            arr[i] = 1+min;
        }//for
        System.out.println(arr[n]);
    }//main
}//class
