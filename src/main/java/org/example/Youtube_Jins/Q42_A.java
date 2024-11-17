package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q42_A {
    /*
RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
즉,전 후 집 색깔은 달라야한다

입력
첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다
예제 입력 1
3
26 40 83
49 60 57
13 89 99
예제 출력 1
96 ==>26 + 57  + 13
 */
    static int[][] rgb = new int[1002][4];
    static int[][] ans = new int[1002][4];

    static int r = 1;
    static int g = 2;
    static int b = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = r; j <= b; j++) {
                rgb[i][j] = sc.nextInt();
            }
        }//사용자로 부터 가격 입력 받기

        for (int i = 1; i <= n; i++) {
            for (int j = r; j <= b; j++) {
                rgb[i][j] = 999999;
            }
        }//초기화
        ans[1][r] = rgb[1][r];
        ans[1][g] = rgb[1][g];
        ans[1][b] = rgb[1][b];
        //1층 최소값 만들기

        for(int i =2; i<= n ; i++){
            for(int  j = r ; j <= b; j++){
                for(int k  =r ; k <= b ; k++){
                    if(j!=k){
                        ans[i][j] = Math.min(ans[i][j], rgb[i][k] + ans[i-1][k]);
                    }
                }//for
            }//for
        }//for
        sc.close();
        System.out.println(Math.min(ans[n][r],Math.min(ans[r][g],ans[g][b])));

    }
}