package org.example.OnedayCoding.Silver2.Day4;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Boj2805
{

    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            int max = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] > max) max = arr[i];
            }

            int answer = 0;
            int start = 0;
            int end = max;

            while(start <= end){
                int mid = (start + end) / 2;
                long sum = 0; // ✨ 1. sum 타입을 long으로 변경

                for(int height : arr){
                    if(mid < height){
                        sum += (height - mid);
                    }
                }

                // ✨ 2. sum >= m 조건을 하나로 묶음
                if(sum >= m){
                    // 원하는 만큼 얻었거나 더 많이 얻었을 때
                    // 높이를 '높여서' 최적의 해(높이의 최댓값)를 찾아본다.
                    answer = mid; // 현재 mid는 가능한 정답
                    start = mid + 1; // ✨ 3. 범위를 확실하게 줄임
                } else {
                    // 나무가 부족하면 높이를 '낮춰야' 한다.
                    end = mid - 1; // ✨ 3. 범위를 확실하게 줄임
                }
            }
            System.out.println(answer);
        }
    }
}
