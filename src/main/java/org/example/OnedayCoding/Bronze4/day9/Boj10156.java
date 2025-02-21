package org.example.OnedayCoding.Bronze4.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10156 {
    public static void main(String[] args)  throws IOException {
        //과자 한 개의 가격이 K, 사려고 하는 과자의 개수가 N이고, 현재 가진 돈의 액수를 M이라 할 때 여러분은 동수가 부모님께 받아야 하는 모자란 돈을 계산하려고 한다
        // a * b > c 조건 문 별 계산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sum =  k * n ;

        if (sum > m){
            System.out.println(sum - m);
        }
        else if(sum < m){
            System.out.println(0);
        }
    }
}
