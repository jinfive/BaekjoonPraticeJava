package org.example.OnedayCoding.Bronze3.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int f = 0;
        int ho = 0;
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int[][] arr = new int[h][m];
            int count = 0;


            boolean shouldBreak = false;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < h; k++) {
                    count++;
                    if (count == p) {
                        shouldBreak = true;
                        f = k;
                        ho = j;
                        break;
                    }
                }
                if (shouldBreak) {
                    break;
                }
            }

            f = f + 1;
            ho = ho + 1;
            if(ho < 10){
                System.out.println(f+"0"+ho);
            }
            else{
                System.out.println(f+""+ho);
            }
        }

    }
}
