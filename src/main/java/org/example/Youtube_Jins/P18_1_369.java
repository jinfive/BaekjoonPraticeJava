package org.example.Youtube_Jins;

public class P18_1_369 {//369게임

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int cnt = getNum(i);

            if (cnt == 0) {
                System.out.print(i + " ");
            }//if
            else {
                for (int k = 0; k < cnt; k++) {
                    System.out.print("짝  ");
                }
            }//else
        }//for

    }//main

    public static int getNum(int i) {
        int j = 0;//3 ,6 ,9 가 몇개들어있는지 카운트를 하기 위한 변수
        while (i > 0) {
            if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
                j++;
            }
            j = j / 10;
        }

        return j;
    }
}//class
