package org.example.OnedayCoding.Bronze4.day2;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Long.parseLong;

public class Boj15552 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Long a = parseLong(st.nextToken());
            Long b = parseLong(st.nextToken());
            bw.write(a + b + "\n");
        }
        bw.flush();
        br.close();
        bw.close();


    }
}
