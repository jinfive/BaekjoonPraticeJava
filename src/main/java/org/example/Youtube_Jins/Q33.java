package org.example.Youtube_Jins;

public class Q33 {
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
    public static void main(String[] args) {
        for(int i =0;i<size;i++){
            for(int j =0;j<size;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        change(0,0);
        for(int i =0;i<size;i++){
            for(int j =0;j<size;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }//main
    public static int[][] arr = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0}
    };//배열 초기화
    final static int size = arr.length;
    final static int color = 2;

    public static void change(int y, int x){
        if(arr[y][x] != 1){
            arr[y][x] = color;
        }//if
       if(x-1 >= 0 &&arr[y][x-1] != color && arr[y][x-1] != 1){
           change(y,x-1);
       }//왼쪽으로 이동
        if(x+1 < size &&arr[y][x+1] != color && arr[y][x+1] != 1){
            change(y,x+1);
        }//오른쪽으로 이동
        if(y+1 < size  &&arr[y+1][x] != color && arr[y+1][x] != 1){
          change(y+1,x);
        }//아래쪽으로 이동
        if(y - 1 >= 0 &&arr[y-1][x] != color && arr[y-1][x] != 1){
           change(y-1,x);
        }//위쪽으로 이동
    }
}//class



