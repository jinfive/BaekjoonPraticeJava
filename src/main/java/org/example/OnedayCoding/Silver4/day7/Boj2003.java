package org.example.OnedayCoding.Silver4.day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2003 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++){
                arr[i] =  Integer.parseInt(st.nextToken());
            }
            int answer = 0;
            for(int i = 0 ; i < N; i++){
                int sum = arr[i];
                if(sum == M){
                    answer++;
                    continue;
                }
                for(int j = i + 1 ; j < N ; j++){
                    sum += arr[j];
                    if(sum == M){
                        answer++;
                        break;
                    }
                    if(sum > M){
                        break;
                    }

                }
            }
            System.out.println(answer);
        }
    }
}
