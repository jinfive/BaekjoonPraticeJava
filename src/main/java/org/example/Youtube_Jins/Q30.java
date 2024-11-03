package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q30 {
    //입력된 숫자까지 + , - 를 반복해라
    //ex 9
    //1 + 2 - 3 + 4- 5 + 6 - 7 + 8 - 9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n =sc.nextInt();
        boolean flag = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            if(flag){
                sb.append(i +" + ");
                flag = false;
            }//if
            else{
               sb.append(i + " - ");
                flag = true;
            }
        }
        sb.append(n);
        System.out.println(sb.toString());


    }
}
