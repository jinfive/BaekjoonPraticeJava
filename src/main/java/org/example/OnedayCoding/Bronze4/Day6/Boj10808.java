package org.example.OnedayCoding.Bronze4.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = (int)input.charAt(i);
        }

//        for (int i = 0; i < input.length(); i++) {
//            System.out.println(arr[i]);
//        } a= 97 z = 122 알파벳 26개

        int[] index = new int[130];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = (int)input.charAt(i);
            index[arr[i]]++;
        }

        for (int i = 97; i <= 122; i++) {
            System.out.print(index[i] + " ");
        }

        br.close();



    }
}
