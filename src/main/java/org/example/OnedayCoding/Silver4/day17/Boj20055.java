package org.example.OnedayCoding.Silver4.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj20055 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[] belt;
        private static boolean[] robot;
        private static int N;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            belt = new int[N * 2];
            int upPoint = 0;
            int downPoint = N - 1;
            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < belt.length ; i ++){
                belt[i] =  Integer.parseInt(st.nextToken());
            }

            robot = new boolean[N]; // 위쪽 벨트만!

            int stage = 0;
            int broken = 0; // broken 변수 선언 추가

            while(true){
                stage++;



                spin();//1번
                robot[N-1] = false; // 내리는 위치에서 즉시 하차

                for(int i = N -2 ; i >= 0 ; i--){//2qjs
                    if(robot[i] && !robot[i + 1] && belt[i + 1]> 0){
                        robot[i] = false;
                        robot[i + 1] = true;
                        belt[i + 1]--;
                    }
                }
                robot[N-1] = false; // 내리는 위치에서 즉시 하차


                if(belt[0] >= 1 && !robot[0]){//3번
                    robot[0] = true;
                    belt[0]--;
                }


                broken = 0; // broken 초기화 위치 수정
                for(int i = 0; i < belt.length; i++){
                    if(belt[i] == 0) broken++;
                }

                if(broken >= K){
                    System.out.println(stage); // step을 stage로 수정
                    break;
                }
            }
        }

        private static void spin(){
            int save = belt[belt.length - 1];

            int[] Belt = new int[belt.length];

            for(int i = 0 ; i < belt.length ; i++){
                Belt[i] = belt[i];

            }
            for(int i = 0 ; i < belt.length - 1 ; i++){
                belt[i + 1] = Belt[i];

            }
            belt[0] = save;

            if(N > 1){

                for(int i = N - 1; i > 0; i--){
                    robot[i] = robot[i - 1];
                }
                robot[0] = false; // 올리는 위치는 회전 후 비어있음
            }
        }
    }


}
