package org.example.OnedayCoding.Bronze3.day18;
import java.util.*;
import java.io.*;

public class Boj10886 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int CountJunhee = 0;


        for (int i = 0 ; i < N ; i++){
            int n = Integer.parseInt(br.readLine());
            if (n == 1){
                CountJunhee++;
            }

        }
        int CountJunheeNot = N - CountJunhee;
        if(CountJunhee > CountJunheeNot){
            System.out.println("Junhee is cute!");
        }
        else{
            System.out.println("Junhee is not cute!");
        }
    }
}
