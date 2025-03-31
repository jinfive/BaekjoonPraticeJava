package org.example.OnedayCoding.Bronze3.day20;
import java.util.*;
import java.io.*;
public class Boj2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Long> arr = new ArrayList<>();
        arr.add(2L); // 0
        for(int i = 1 ; i <= n ; i++){
            arr.add(arr.get(i-1) +(long) Math.pow(2,i-1));
        }
        System.out.println(arr.get(n) * arr.get(n));


    }
}
