package org.example.OnedayCoding.Silver4.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1931 {

    // The main method must be in a class named "Main".
    class Main {


        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            Time[] time = new Time[people];
            int answer = 0;
            for(int i = 0 ; i  < people ; i++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                time[i] = new Time(start, end);
            }
            Arrays.sort(time, (o1, o2)->{
                if(o1.end != o2.end) {
                    return o1.end - o2.end;
                }
                return o1.start - o2.start; // 끝나는 시간이 같으면 시작시간 오름차순
            });
            int nowTime = -1;
            for(int i = 0 ; i < people ; i++){
                if(nowTime <= time[i].start){
                    answer++;
                    nowTime = time[i].end;
                }
            }
            System.out.println(answer);
        }
        private static class Time{
            int start;
            int end;
            public Time(int start, int end){
                this.start = start;
                this.end = end;
            }
        }
    }
}
