package org.example.OnedayCoding.Bronze4.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[3];
        int[] result = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(input[i]);
            result[i] = arr[i];
            sum += arr[i];
        }

        if (sum >= 100) {
            System.out.println("OK");
        } else {
            Arrays.sort(arr);//오름차순 정렬
            for (int i = 0; i < 3; i++) {
                if (arr[0] == result[i]) {
                    switch (i) {
                        case 0:
                            System.out.println("Soongsil");
                            break;
                        case 1:
                            System.out.println("Korea");
                            break;
                        case 2:
                            System.out.println("Hanyang");
                            break;

                    }
                }
            }

        }

    }
}
