package org.example.OnedayCoding.Silver3.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj16926 {
 
    public class Main{
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb=new StringBuilder();
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int arr[][] = new int[N][M];

            for(int i=0; i<N;i++){
                st = new StringTokenizer(br.readLine());
                for(int j =0; j<M;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }


            for(int  i=0; i<R; i++){
                for(int j=0; j<Math.min(N,M)/2; j++){//레이어 결정
                    int temp = arr[j][j];
                    for(int k=j; k<M-j-1; k++) {//상단 왼 -> 오 이동
                        arr[j][k] = arr[j][k+1];
                    }

                    for(int k=j; k<N-1-j; k++) {//오른쪽 아래 -> 위
                        arr[k][M-j-1] = arr[k+1][M-j-1];
                    }

                    for(int k=M-j-1; k>j; k--) {//하단 오른 -> 왼
                        arr[N-1-j][k] = arr[N-1-j][k-1];
                    }

                    for(int k=N-j-1; k>j; k--) {//좌측 위 - > 아래
                        arr[k][j] = arr[k-1][j];
                    }
                    arr[j+1][j] = temp;
                }
            }

            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }

    }
}
