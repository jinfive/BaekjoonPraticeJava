package org.example.OnedayCoding.Silver4.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2296 {


    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Set<Integer> sumSet = new HashSet<>();

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            // 입력 받기
            for(int i = 0 ; i  < N ; i++ ){
                arr[i] = Integer.parseInt(br.readLine());
            }

            // 배열 정렬 (한 번만)
            Arrays.sort(arr);

            // 두 수의 합 생성 (모든 조합)
            for(int i = 0 ; i < N ; i++){
                for(int j = 0 ; j < N ; j++){
                    sumSet.add(arr[i] + arr[j]);
                }
            }

            List<Integer> sum = new ArrayList<>(sumSet);
            Collections.sort(sum);

            // 가장 큰 수부터 탐색
            for(int i = N - 1 ; i >= 0  ; i--){
                for(int j = N - 1 ; j >= 0 ; j--){
                    int minus = arr[i] - arr[j];  // 빼기 연산자 사용
                    if(Collections.binarySearch(sum, minus) >= 0){
                        System.out.println(arr[i]);
                        return;
                    }
                }
            }
        }
    }

}
