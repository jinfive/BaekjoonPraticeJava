package org.example.Youtube_Jins;

import java.util.Scanner;

public class Rq5 {
    //대문자 > 소문자
    //소문자 > 대문자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        String input =sc.nextLine();
        char []arr=input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 'A' && arr[i] < 'Z') {
                arr[i] = (char) (arr[i] - ('A'-'a') ); //a => z =>A => Z
                System.out.print(arr[i]);
            }//대문자일때
            else {
                arr[i] = (char) (arr[i] + ('A'-'a') ); //a => z =>A => Z
                System.out.print(arr[i]);
            }
        }//For
        System.out.println();
        System.out.println('a' - 'A');
        sc.close();
    }//main
}
