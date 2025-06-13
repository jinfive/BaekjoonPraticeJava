package org.example.OnedayCoding.Silver5.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11651 {

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            Graph[] gArr = new Graph[n];
            for(int i = 0 ; i < n ; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                gArr[i] = new Graph(x, y);
            }
            Arrays.sort(gArr , (o1, o2)->{

                if(o1.y == o2.y){
                    return o1.x - o2.x;
                }
                return o1.y - o2.y;

            });

            for(int i = 0 ; i < n ; i++){
                System.out.println(gArr[i].x + " " + gArr[i].y);
            }

        }
        private static class Graph{
            int x;
            int y;
            public Graph(int x , int y){
                this.x = x;
                this.y = y;
            }
        }
    }

