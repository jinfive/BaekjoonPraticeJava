package org.example.OnedayCoding.Bronze1.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2947 {
 
    public class Main {
// 첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
// 두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
// 세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
// 네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
// 만약 순서가 1, 2, 3, 4, 5 순서가 아니라면 1 단계로 다시 간다.

        public static void main(String[] args) throws Exception{
            BufferedReader br = new   BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[5];

            for(int i = 0 ; i < 5 ; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }

            while(a[0] != 1 || a[1] != 2 || a[2] != 3 || a[3] != 4 || a[4] != 5 ){
                // 1단계: 첫 번째와 두 번째 비교
                if(a[0] > a[1]) {
                    int temp = a[0];
                    a[0] = a[1];
                    a[1] = temp;
                    printArray(a);
                }

                // 2단계: 두 번째와 세 번째 비교
                if(a[1] > a[2]) {
                    int temp = a[1];
                    a[1] = a[2];
                    a[2] = temp;
                    printArray(a);
                }

                // 3단계: 세 번째와 네 번째 비교
                if(a[2] > a[3]) {
                    int temp = a[2];
                    a[2] = a[3];
                    a[3] = temp;
                    printArray(a);
                }

                // 4단계: 네 번째와 다섯 번째 비교
                if(a[3] > a[4]) {
                    int temp = a[3];
                    a[3] = a[4];
                    a[4] = temp;
                    printArray(a);
                }
            }
        }

        private static void printArray(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }



}
