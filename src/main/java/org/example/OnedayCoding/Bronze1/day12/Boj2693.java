package org.example.OnedayCoding.Bronze1.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj2693 {
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            //String 로 받고 글자별로 char을 받고 이를 int형으로 바꿔보자
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCase = Integer.parseInt(st.nextToken());
            for(int i = 0 ; i < testCase ; i++){

                String str = br.readLine();
                String[] arr = str.split(" ");
                int[] numArr = new int[10];
                for(int j = 0 ; j < 10 ; j++){
                    numArr[j] =Integer.parseInt(arr[j]);
                }
                Arrays.sort(numArr);
                System.out.println(numArr[numArr.length - 3]);

            }

        }
    }
}
