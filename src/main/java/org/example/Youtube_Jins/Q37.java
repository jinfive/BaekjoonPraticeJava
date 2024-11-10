package org.example.Youtube_Jins;


public class Q37 {
    public static int arr[][] = {
            {0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 0, 1, 1}};

    final static int SIZE = arr.length;
    final static int APART = 1;

    static int apprCnt = 0;
    static int[] house = new int[10];


    public static void apt(int y, int x, int apprCnt) {
        arr[y][x] = 0;
        house[apprCnt]++;

        if( x -1 >= 0 && arr[y][x-1] == 1){
            apt(y,x-1,apprCnt);
        }
        if( x+1 < SIZE && arr[y][x+1] == 1){
            apt(y,x+1,apprCnt);
        }
        if( y -1 >= 0 && arr[y-1][x] == 1){
            apt(y-1,x,apprCnt);
        }
        if( y+1 < SIZE && arr[y+1][x] == 1){
            apt(y+1,x,apprCnt);
        }

    }
    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(arr[i][j] == APART) {
                    apt(i, j, apprCnt);
                    apprCnt++;
                }
            }
        }
        System.out.println(apprCnt);
        for(int i : house){
            System.out.print(i + " ");
        }
    }
}



