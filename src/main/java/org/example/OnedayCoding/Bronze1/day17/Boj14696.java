package org.example.OnedayCoding.Bronze1.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj14696 {

    public class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            for(int t = 0; t < N; t++){
                StringTokenizer stA = new StringTokenizer(br.readLine());
                int aSize = Integer.parseInt(stA.nextToken());
                int[] A = new int[aSize];
                for(int i = 0; i < aSize; i++){
                    A[i] = Integer.parseInt(stA.nextToken());
                }

                StringTokenizer stB = new StringTokenizer(br.readLine());
                int bSize = Integer.parseInt(stB.nextToken());
                int[] B = new int[bSize];
                for(int i = 0; i < bSize; i++){
                    B[i] = Integer.parseInt(stB.nextToken());
                }

                // 각 테스트 케이스마다 정렬
                Arrays.sort(A);
                Arrays.sort(B);

                boolean check = false;
                for(int i = 1; bSize - i >= 0 && aSize - i >= 0; i++){
                    if(A[aSize-i] > B[bSize-i]){
                        System.out.println("A");
                        check = true; // = 연산자 추가
                        break;
                    }
                    else if(A[aSize-i] < B[bSize-i]){
                        System.out.println("B");
                        check = true; // = 연산자 추가
                        break;
                    }
                }

                if(!check){ // check가 false일 때 (변경되지 않았을 때)
                    if(aSize> bSize){
                        System.out.println("A");
                    }
                    else if(aSize < bSize){
                        System.out.println("B");
                    }
                    else{
                        System.out.println("D");
                    }
                }
            }//for
        }//main
    }//Main

}
