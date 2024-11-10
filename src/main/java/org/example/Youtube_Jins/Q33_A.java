package org.example.Youtube_Jins;

public class Q33_A {
    /*
    00000
    00110
    00001
    00000
    00100

    0을 모두 2로 색칠하시오.
    (단, 0은 어떻게든 모두 연결됨)

    정답:
    22222
    22112
    22221
    22222
    22122
     */
    public static int[][] arr = {
            {0,0,0,0,0},
            {0,0,1,1,0},
            {0,0,0,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
    };//배열 초기화

    static final  int SIZE = 5;
    static final int COLOR  = 2;

    public static void color(int x , int y){
        if(arr[x][y] !=1){
            arr[x][y] = COLOR;
        }
        if(x -1 >=0 && arr[x-1][y] != COLOR && arr[x-1][y] != 1){
            color(x -1, y);
        }//왼쪽이동
         if(x + 1 <=SIZE-1 && arr[x+1][y] != COLOR && arr[x+1][y] != 1){
            color(x +1, y);
        }//오른쪽
        if(y + 1 <=SIZE-1 && arr[x][y+1] != COLOR && arr[x][y+1] != 1){
            color(x , y+1);
        }//아래
        if(y - 1 >=0 && arr[x][y-1] != COLOR && arr[x][y-1] != 1){
            color(x , y-1);
        }//위





    }

    public static void main(String[] args) {
        for(int i = 0;i<SIZE;i++){
            for(int j = 0;j<SIZE;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        color(0,0);

        for(int i = 0;i<SIZE;i++){
            for(int j = 0;j<SIZE;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }//main
}
