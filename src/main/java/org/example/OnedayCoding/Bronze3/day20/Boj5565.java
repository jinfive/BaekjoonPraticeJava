package org.example.OnedayCoding.Bronze3.day20;
import java.util.*;
import java.io.*;

public class Boj5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int nine = 0;
        for (int i = 1; i <= 9; i++) {
            int n = Integer.parseInt(br.readLine());
            nine += n;
        }
        System.out.println(sum - nine);
    }
}
