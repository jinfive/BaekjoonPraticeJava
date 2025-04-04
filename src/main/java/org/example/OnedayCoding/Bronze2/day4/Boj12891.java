package org.example.OnedayCoding.Bronze2.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12891 {
    static int[] myArr;
    static int screetCheck;
    static int[] check;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());//입력 문자열 길이
        int p = Integer.parseInt(st.nextToken());//부분 문자열 길이

        String str = br.readLine();

        int result = 0;

        screetCheck = 0;
        check = new int[4];
        myArr = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
            if (check[i] == 0) {
                screetCheck++;
            }
        }


        //초기 배열 검사
        for (int i = 0; i < p; i++) {
            Add(str.charAt(i));

        }
        if (screetCheck == 4) {
            result++;
        }

        for (int i = p; i < s; i++) {
            int j = i - p;
            Add(str.charAt(i));
            Remove(str.charAt(j));
            if (screetCheck == 4) {
                result++;
            }
        }
        System.out.println(result);


    }

    private static void Add(char v) {
        switch (v) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == check[0]) {
                    screetCheck++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == check[1]) {
                    screetCheck++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == check[2]) {
                    screetCheck++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == check[3]) {
                    screetCheck++;
                }
                break;
        }
    }

    private static void Remove(char v) {
        switch (v) {
            case 'A':

                if (myArr[0] == check[0]) {
                    screetCheck--;
                }
                myArr[0]--;
                break;
            case 'C':

                if (myArr[1] == check[1]) {
                    screetCheck--;
                }
                myArr[1]--;
                break;
            case 'G':

                if (myArr[2] == check[2]) {
                    screetCheck--;
                }
                myArr[2]--;
                break;
            case 'T':

                if (myArr[3] == check[3]) {
                    screetCheck--;
                }
                myArr[3]--;
                break;

        }
    }

}



