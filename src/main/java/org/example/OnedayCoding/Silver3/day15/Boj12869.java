package org.example.OnedayCoding.Silver3.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12869 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String str = br.readLine();
            char[] arr = str.toCharArray();
            int answer = 0;
            for(int i = 0 ; i < n ; i ++){
                if(arr[i] == 'P'){
                    for(int j = Math.max(0 , i - k) ; j <= Math.min(n - 1, i + k) ; j ++){
                        if(arr[j] == 'H'){
                            arr[j] ='O';
                            answer++;
                            break;
                        }
                    }
                }
            }
            System.out.println(answer);

        }
    }
}
