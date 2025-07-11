package org.example.OnedayCoding.Silver5.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj5536 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            People [] people = new People[number];
            for(int i = 0 ; i < number ; i++){
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int day = Integer.parseInt(st.nextToken());
                int month = Integer.parseInt(st.nextToken());
                int year = Integer.parseInt(st.nextToken());
                int sumDay = sum(day, month, year);
                people[i] = new People(name, sumDay);
            }
            Arrays.sort(people,(o1, o2) -> {
                return o1.days - o2.days;
            });

            System.out.println(people[number - 1].name);
            System.out.println(people[0].name);

        }
        private static int sum(int day, int month, int year){
            int sum = 0;
            sum += day;
            sum += (month * 30);
            sum += (year * 12 * 30);
            return sum;
        }
        private static class People{
            String name;
            int days;
            public People(String name, int days){
                this.name = name;
                this.days = days;
            }
        }
    }
}
