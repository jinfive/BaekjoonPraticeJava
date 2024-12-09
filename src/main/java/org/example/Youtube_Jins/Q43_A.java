package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q43_A {
    /*
    n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다.
    이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다. 그 경우의 수를 구하시오.
    각각의 동전은 몇 개라도 사용할 수 있다.
    사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
    3 10
    1
    2
    5       10
    ===================================================================
        1   2   3   4   5   6   7   8   9   10
    1   1   1   1   1   1   1   1   1   1   1
    2   0   1   1   2   2   3   3   4   4   5
    5   0   0   0   0   1   1   2   2   3   4
    t   1   2   2   3   4   5   6   7   8   10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("필요한 동전의 수를 입력하세요");
        int coin = sc.nextInt();
        System.out.println("만들 돈의 금액을 입력하세요");
        int money = sc.nextInt();

        int[] arr = new int[100];
        int[] dp = new int[1000];

        for(int i = 1 ; i <= coin ; i++){
            arr[i] = sc.nextInt();//문제에 사용될 동전 입력하기
        }
       dp[0] = 1; // Dp 문제플 풀기 위해서는 내가 사전에 알고 있는값은 먼저 대입
        for(int i = 1 ; i <=coin ; i++) {
            for (int j = arr[i]; j <= money; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println(dp[money]);

    }

}
