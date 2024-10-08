package org.example.Youtube_Jins;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        String number = sc.nextLine();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            switch (ch) {
                case '0':
                    count0++;
                    break;
                case '1':
                    count1++;
                    break;
                case '2':
                    count2++;
                    break;
                case '3':
                    count3++;
                    break;
                case '4':
                    count4++;
                    break;
                case '5':
                    count5++;
                    break;
                case '6':
                    count6++;
                    break;
                case '7':
                    count7++;
                    break;
                case '8':
                    count8++;
                    break;
                case '9':
                    count9++;
                    break;

            }//switch
        }//for
        System.out.println("0:\t"+count0);
        System.out.println("1:\t"+count1);
        System.out.println("2:\t"+count2);
        System.out.println("3:\t"+count3);
        System.out.println("4:\t"+count4);
        System.out.println("5:\t"+count5);
        System.out.println("6:\t"+count6);
        System.out.println("7:\t"+count7);
        System.out.println("8:\t"+count8);
        System.out.println("9:\t"+count9);
    }//main
}
