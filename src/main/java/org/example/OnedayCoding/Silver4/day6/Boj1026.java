package org.example.OnedayCoding.Silver4.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj1026 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                A.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                B.add(Integer.parseInt(st.nextToken()));
            }
            int answer = 0;
            Collections.sort(A);
            Collections.sort(B, Collections.reverseOrder());
            for(int i = 0 ; i < n ; i++){
                answer += (A.get(i) * B.get(i));
            }
            System.out.println(answer);

        }
    }
}
