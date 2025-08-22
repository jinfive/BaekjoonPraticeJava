package org.example.OnedayCoding.Silver3.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj3273 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        Map<Integer, Integer> numMap = new HashMap<>();
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i = 0 ;  i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            numMap.put(arr[i], numMap.getOrDefault(arr[i], 0) + 1);
        }
        int k = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0 ; i < n ; i++){
            int now = arr[i];
            if(numMap.containsKey(k - arr[i])){
                answer++;
            }
        }
        System.out.println(answer / 2);

    }
}
