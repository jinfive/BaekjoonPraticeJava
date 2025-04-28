package org.example.OnedayCoding.Bronze1.Day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1924 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int year = Integer.parseInt(st.nextToken());
            int mounth = Integer.parseInt(st.nextToken());
            int totalDays = 0;

            for(int i =1 ; i < year ; i++){
                if(i == 1 || i ==3 || i == 5 || i == 7 || i == 8 || i ==10 || i ==12){//1, 3, 5, 7, 8, 10, 12
                    totalDays += 31;
                }
                else if(i == 4 || i == 6 || i==9 || i==11){//4, 6, 9, 11
                    totalDays += 30;
                }
                else{
                    totalDays += 28;
                }
            }
            totalDays += mounth;
            switch(totalDays % 7){// SUN, MON, TUE, WED, THU, FRI, SAT
                case 0:
                    System.out.println("SUN");
                    break;
                case 1 :
                    System.out.println("MON");
                    break;
                case 2:
                    System.out.println("TUE");
                    break;
                case 3:
                    System.out.println("WED");
                    break;
                case 4:
                    System.out.println("THU");
                    break;
                case 5:
                    System.out.println("FRI");
                    break;
                case 6:
                    System.out.println("SAT");
                    break;

            }

        }
    }
}
