package org.example.OnedayCoding.Bronze1.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1197 {
    // The main method must be in a class named "Main".
    class Main {
        private static int [] parent;
        private static int[][] inputArr;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());



            int v = Integer.parseInt(st.nextToken());//정점
            int e = Integer.parseInt(st.nextToken());//간선

            //초기화
            parent = new int [v+1];
            for(int i = 1 ;i < parent.length ; i++ ){
                parent[i] = i;
            }

            inputArr = new int [e][3];



            int answer = 0;
            int edge = 0;


            for(int i = 0 ; i < e ;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                inputArr[i][0] =a;
                inputArr[i][1] =b;
                inputArr[i][2] =value;

            }//for

            Arrays.sort(inputArr ,(a , b)->{
                return a[2] - b[2];
            });//오름 차순 정렬

            for(int i = 0 ; i < inputArr.length ;i++ ){
                if(v - 1 == edge) break;
                if(find(inputArr[i][0]) != find(inputArr[i][1])){
                    union((inputArr[i][0]),(inputArr[i][1]));
                    answer += inputArr[i][2];
                    edge ++;
                }
            }
            System.out.println(answer);
        }

        private static void union(int  a, int b){
            a = find(a);
            b = find(b);
            if(a != b ){
                parent[b] = a;
            }
        }

        private static int find (int a){
            if(a == parent[a]){
                return a;
            }
            return parent[a] = find(parent[a]);//경로 압축
        }
    }
}
