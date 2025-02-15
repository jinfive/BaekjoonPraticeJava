package org.example.OnedayCoding.Bronze4.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj2480 {
    public static void main(String[] args) throws IOException {
//        같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());

        if(a==b&&b==c){
            //case1
            System.out.println(10000 + a * 1000);
        }//if
        else if (a == c || a == b || b == c) {
            //case 2
            if(a == b){
                System.out.println(1000 + a * 100);
            } else if (b == c){
                System.out.println(1000 + b * 100);
            } else {
                System.out.println(1000 + a * 100);
            }
        }//else if
        else{
            int[] arr = new int[3];
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;

//            for(int i=0;i<2;i++){
//
//                if (arr[i]<arr[i+1]){
//                    int tmp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=tmp;
//                }
//            }

            //case3
            Arrays.sort(arr);
//            for(int i=0;i<3;i++){
//                System.out.println(arr[i]);
//            }
            System.out.println(arr[2] *100);
        }//else
    }
}
