package org.example.OnedayCoding.Silver5.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11650 {


    // The main method must be in a class named "Main".
    class Main {
        private static List<Point> myList;
        public static void main(String[] args) throws Exception{
            myList = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            for(int i = 0 ; i  < n ; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                myList.add(new Point(a, b));
            }
            Collections.sort(myList,(o1, o2)->{
                if(o1.x == o2.x){
                    return o1.y - o2.y;
                }
                return o1.x - o2.x;
            });

            for (Point p : myList) {
                System.out.println(p.x + " " + p.y);
            }
        }
        private static class Point{
            int x;
            int y;
            public  Point(int x,int y){
                this.x = x;
                this.y = y;
            }
        }
    }
}
