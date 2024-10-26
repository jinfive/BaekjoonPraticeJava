package org.example.Youtube_Jins;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P19_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요");
        String s = sc.nextLine();
        HashSet<String> set = new HashSet<>(Arrays.asList(s.split(" ")));
        System.out.println(Arrays.toString(set.toArray()));
    }//main
}
