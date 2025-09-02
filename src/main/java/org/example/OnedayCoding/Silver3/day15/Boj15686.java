package org.example.OnedayCoding.Silver3.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj15686 {


    // The main method must be in a class named "Main".
    class Main {
        private static List<Node> chicken;
        private static List<Node> home;
        private static int answer = Integer.MAX_VALUE;
        private static int[][] map;
        private static int M;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            map = new int[N][N];
            chicken = new ArrayList<>();
            home = new ArrayList<>();

            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < N ; j++){
                    int num = Integer.parseInt(st.nextToken());
                    if(num == 1){//집
                        home.add(new Node(i ,j));
                    }
                    else if(num == 2){
                        chicken.add(new Node(i , j));
                    }
                }
            }
            find(0, 0, "");
            System.out.println(answer);

        }
        private static void find(int start, int dept, String str){
            if(dept == M){
                int res = col(str);
                answer = Math.min(res, answer);
                return;
            }
            for(int i = start ; i < chicken.size() ; i++){
                find(i + 1, dept + 1, str +" " + i);
            }
        }
        private static int col(String str){

            String[] arr = str.trim().split(" ");
            int answerArr[] = new int[home.size()];
            Arrays.fill(answerArr, Integer.MAX_VALUE);
            for(int i = 0 ; i < arr.length; i++){
                for(int j = 0 ; j <  home.size() ;  j++){
                    int n = Math.abs(chicken.get(Integer.parseInt(arr[i])).x - home.get(j).x) + Math.abs(chicken.get(Integer.parseInt(arr[i])).y - home.get(j).y);
                    if(n < answerArr[j]){
                        answerArr[j] = n;
                    }
                }
            }
            int sum = 0;
            for(int i = 0 ; i < answerArr.length ; i++){
                sum += answerArr[i];
            }
            return sum;
        }
        private static class Node{
            int x;
            int y;
            public Node(int x, int y){
                this.x = x;
                this.y = y;
            }
        }
    }
}
