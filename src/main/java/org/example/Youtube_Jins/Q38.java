package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q38 {
    /*
    문제
강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다.
이 치킨집에서는 치킨을 한 마리 주문할 때마다 도장을 하나씩 찍어 주는데,
도장을 k개 모으면 치킨 쿠폰 한 장으로 교환할 수 있다.
강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라.
 단, 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 갖고 있어야 한다.
  n  k
입4   3    5  쿠폰으로 4마리를 시키면 도장 4개를 얻어서 5마리
출10  3    14 쿠폰으로 10마리를 시키면 도장 10 도장 3장 필요
     */
    static int stamp = 0;
    static int chicken = 0;

    public static int order(int n ,int k){
        if(stamp  < k && n ==0){
            return chicken;
        }
        order()

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        String str = sc.nextLine();
        String[] starr = str.split(" ");
        int[] arr = new int[starr.length];
        for (int i = 0; i < starr.length; i++) {
            arr[i] = Integer.parseInt(starr[i]);
        }
        int n = arr[0];
        int k = arr[1];


    }
}
