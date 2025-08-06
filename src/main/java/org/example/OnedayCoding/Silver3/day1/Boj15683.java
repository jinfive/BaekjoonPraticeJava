package org.example.OnedayCoding.Silver3.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj15683 {


    // The main method must be in a class named "Main".
    class Main {
        private static int[][] maps;
        private static int N;
        private static int M;
        private static int[] dx = new int[]{-1, 0 , 1, 0};//북0, 동1, 남2, 서3
        private static int[] dy = new int[]{0, 1, 0 , -1};//북, 동, 남, 서
        private static List<Cctv> cctvList;
        private static int answer = Integer.MAX_VALUE;
        private static int[] outputDir;
        private static int[][] copyMaps;

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            maps = new int[N][M];
            cctvList = new ArrayList<>();
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < M ; j++){
                    maps[i][j] = Integer.parseInt(st.nextToken());
                    if(maps[i][j] < 6 && maps[i][j] != 0){
                        cctvList.add(new Cctv(maps[i][j], i , j));
                    }
                }
            }
            outputDir = new int[cctvList.size()];
            find(0);
            System.out.println(answer);

        }
        private static void find(int now){
            if(now == cctvList.size()){
                copyMaps = new int[N][M];
                for(int i = 0 ; i < N ; i++){
                    for(int j = 0 ; j < M ; j++){
                        copyMaps[i][j] = maps[i][j];
                    }
                }
                for(int i = 0 ; i < cctvList.size() ; i++){
                    dir(cctvList.get(i), outputDir[i]);
                }
                findAnswer(); // ← 이 줄 추가!
                return;

            }
            else{
                for(int i = 0 ; i < 4 ; i++){
                    outputDir[now] = i;
                    find(now + 1);
                }
            }
        }
        private static void findAnswer(){
            int count = 0;
            for(int i = 0 ; i < N ; i ++){
                for(int j = 0 ; j < M ; j++){
                    if(copyMaps[i][j] == 0 ){
                        count++;
                    }
                }
            }
            answer = Math.min(count, answer);

        }
        private static void dir(Cctv cctv, int d){//방향 골라
            if(cctv.num == 1){
                if(d == 0){//북
                    watch(cctv.x , cctv.y, 0);
                }
                else if(d == 1){
                    watch(cctv.x , cctv.y, 1);
                }
                else if(d == 2){
                    watch(cctv.x , cctv.y, 2);
                }
                else if(d == 3){
                    watch(cctv.x , cctv.y, 3);
                }
            }
            else if(cctv.num == 2){
                if(d == 0 || d == 2){//북남
                    watch(cctv.x , cctv.y, 0);
                    watch(cctv.x , cctv.y, 2);
                }
                else{//동서
                    watch(cctv.x , cctv.y, 1);
                    watch(cctv.x , cctv.y, 3);
                }
            }
            else if(cctv.num == 3){
                if(d == 0){//북 동
                    watch(cctv.x , cctv.y, 0);
                    watch(cctv.x , cctv.y, 1);
                }
                else if(d == 1){//동 남
                    watch(cctv.x , cctv.y, 1);
                    watch(cctv.x , cctv.y, 2);
                }
                else if(d == 2){//남 서
                    watch(cctv.x , cctv.y, 2);
                    watch(cctv.x , cctv.y, 3);
                }
                else if(d == 3){//북서
                    watch(cctv.x , cctv.y, 3);
                    watch(cctv.x , cctv.y, 0);
                }

            }
            else if(cctv.num == 4){
                if(d == 0){//서 북 동
                    watch(cctv.x , cctv.y, 3);
                    watch(cctv.x , cctv.y, 0);
                    watch(cctv.x , cctv.y, 1);
                }
                else if(d == 1){//북 동 남
                    watch(cctv.x , cctv.y, 0);
                    watch(cctv.x , cctv.y, 1);
                    watch(cctv.x , cctv.y, 2);
                }
                else if(d == 2){//동 남 서
                    watch(cctv.x , cctv.y, 1);
                    watch(cctv.x , cctv.y, 2);
                    watch(cctv.x , cctv.y, 3);
                }
                else if(d == 3){//남 서 북
                    watch(cctv.x , cctv.y, 2);
                    watch(cctv.x , cctv.y, 3);
                    watch(cctv.x , cctv.y, 0);
                }
            }
            else{
                watch(cctv.x , cctv.y, 0);
                watch(cctv.x , cctv.y, 1);
                watch(cctv.x , cctv.y, 2);
                watch(cctv.x , cctv.y, 3);

            }
        }
        private static void watch(int x, int y, int num){
            while(true){
                int nextX = x + dx[num];
                int nextY = y + dy[num];
                if(nextX >= 0 && nextY >=0 && nextX < N && nextY < M && maps[nextX][nextY] != 6){
                    if(copyMaps[nextX][nextY] >= 1 && copyMaps[nextX][nextY] < 6){
                        x = x + dx[num];
                        y = y + dy[num];
                        continue;
                    }
                    copyMaps[nextX][nextY] = -1;
                    x = x + dx[num];
                    y = y + dy[num];
                }else{
                    return;
                }
            }
        }
        private static class Cctv{
            int num;
            int x;
            int y;
            public Cctv(int num, int x, int y){
                this.num = num;
                this.x = x;
                this.y = y;
            }
        }
    }
}
