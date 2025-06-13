package org.example.OnedayCoding.Silver5.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj7568 {

    // The main method must be in a class named "Main".
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken());
        int[] answer = new int[people];
        int[][] peopleArr = new int[people][2];

        for (int i = 0; i < people; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                peopleArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < people; i++) {//기준
            int count = 0;
            for (int j = 0; j < people; j++) {//비교
                if (i == j) continue;
                if (peopleArr[i][0] < peopleArr[j][0]) {
                    if (peopleArr[i][1] < peopleArr[j][1]) {
                        count++;
                    }
                }
            }
            answer[i] = count + 1;
        }
        for (int n : answer) {
            System.out.print(n + " ");
        }
    }

}
