package org.example.OnedayCoding.Silver3.day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2559 {
  

    class Main {
        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int gap = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i  < N ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for(int i = 0 ; i < gap ; i++){
                sum += arr[i];
            }
            int startP = 0;
            int endP = gap;
            int answer  = sum;
            while(true){

                if(endP >= N){
                    break;
                }

                int newSum = (sum - arr[startP] + arr[endP]);
                if(newSum > sum){
                    answer = Math.max(newSum, answer);
                }
                sum = newSum;

                startP++;
                endP++;
            }
            System.out.println(answer);
        }
    }

}
