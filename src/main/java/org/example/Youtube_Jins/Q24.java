package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q24 {
    //백준2908
    public static void main(String[] args) {
        System.out.println("수를 입력해줘요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arra = new int[String.valueOf(a).length()];
        int []arrb = new int[String.valueOf(b).length()];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = a %10;
            a /= 10;
        }
        System.out.println();
        for (int i = 0; i < arrb.length; i++) {
            arrb[i] = b %10;
            b /= 10;

        }//for
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] > arrb[i]) {
                for(int x : arra){
                    System.out.print(x);
                }
                break;
            }
            else if (arra[i] < arrb[i]) {
                for(int x : arrb){
                    System.out.print(x);

                }
                break;
            }
        }

    }
}
