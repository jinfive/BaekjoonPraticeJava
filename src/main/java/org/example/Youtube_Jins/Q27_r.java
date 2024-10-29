package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q27_r {
    //달팽이
    /*
    1   2   3
    8    9    4
    7    6    5
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>>>>.");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int x = 0;
        int y = 0;
        int num = 1;
        int f = n;
	/*
	 *  1  2  3  4  5
		16 17 18 19  6
		15 24 25 20  7
		14 23 22 21  8
		13 12 11 10  9
	 *
	 *
	 */

        for (int j = 0; j < 2*n-1; j++) {
            switch (j % 4) {
                case 0:
                    for (int i = 0; i < f; i++) {
                        arr[y][x] =num;
                        num++;
                        x++;
                    }
                    x--;
                    y++;

                    f--;
                    break;
                case 1:
                    for (int i = 0; i < f; i++) {
                        arr[y][x] =num;
                        num++;
                        y++;
                    }
                    x--;
                    y--;

                    break;
                case 2:
                    for (int i = 0; i < f; i++) {
                        arr[y][x] =num;
                        num++;
                        x--;
                    }
                    x++;
                    y--;

                    f--;
                    break;
                case 3:
                    for (int i = 0; i < f; i++) {
                        arr[y][x] =num;
                        num++;
                        y--;
                    }
                    x++;
                    y++;


                    break;
            }//switch
        }//for

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }//main
}//class

