package org.example.OnedayCoding.Silver4.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj10825 {


    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            Profile[] profile = new Profile[people];

            for(int i = 0 ; i < people ; i++){
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int korea = Integer.parseInt(st.nextToken());
                int english = Integer.parseInt(st.nextToken());  // 영어가 먼저
                int math = Integer.parseInt(st.nextToken());     // 수학이 나중
                profile[i] = new Profile(name, korea, math, english);
            }

            Arrays.sort(profile, (o1, o2) -> {
                if(o1.korea != o2.korea){
                    return o2.korea - o1.korea;
                }
                if(o1.english != o2.english){
                    return o1.english - o2.english;
                }
                if(o1.math != o2.math){
                    return o2.math - o1.math;
                }
                return o1.name.compareTo(o2.name);
            });

            for(int i = 0 ; i < people ; i++){
                System.out.println(profile[i].name);
            }
        }

        private static class Profile{
            String name;
            int korea;
            int math;
            int english;
            public Profile(String name, int korea, int math, int english){
                this.name = name;
                this.korea = korea;
                this.math = math;
                this.english = english;
            }
        }
    }

}
