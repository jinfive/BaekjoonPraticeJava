package org.example.OnedayCoding.Bronze2.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1978 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            boolean isTrue = true;
            if (temp == 1) isTrue = false;
            else {
                //1 보다 크고 약수가 나 외에 없는 수가 소수
                for (int j = 2; j < temp; j++) {
                    if (temp % j == 0) {
                        isTrue = false;
                        break;
                    }
                }
            }
            if (isTrue) {
                count++;
            }
        }
        System.out.println(count);
    }
}
