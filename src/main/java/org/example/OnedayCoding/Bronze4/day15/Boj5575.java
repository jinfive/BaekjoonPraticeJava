package org.example.OnedayCoding.Bronze4.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[3];
        int[] arr = new int[6];

        for (int j = 0; j < 3; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 6; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result[0] = arr[3] - arr[0];
            result[1] = arr[4] - arr[1];
            result[2] = arr[5] - arr[2];

            if (result[1] < 0) {
                result[0]--;
                result[1] = 60 + result[1];
            }
            if (result[2] < 0) {
                result[1]--;
                if(result[1]<0){
                    result[0]--;
                    result[1] = 60 + result[1];
                }
                result[2] = 60 + result[2];
            }
            System.out.println(result[0] + " " + result[1] + " " + result[2]);
        }
        br.close();

    }
}
