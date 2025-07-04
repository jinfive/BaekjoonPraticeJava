package org.example.OnedayCoding.Silver5.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOj8979 {
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int how = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][4];
            int[] me = new int[4];
            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
                arr[i][2] = Integer.parseInt(st.nextToken());
                arr[i][3] = Integer.parseInt(st.nextToken());
                if(arr[i][0] == how){
                    me[0] = arr[i][0];
                    me[1] = arr[i][1];
                    me[2] = arr[i][2];
                    me[3] = arr[i][3];
                }
            }
            int cnt = 1;
            for(int i = 0; i < n; i++){
                if(me[0] != arr[i][0]){
                    if(arr[i][1] > me[1]){
                        cnt++;
                        continue;
                    }
                    else if(arr[i][1] == me[1] && arr[i][2] > me[2]){
                        cnt++;
                        continue;
                    }
                    else if(arr[i][1] == me[1] && arr[i][2] == me[2] && arr[i][3] > me[3]){
                        cnt++;
                        continue;
                    }

                }
            }

            System.out.println(cnt)        ;



        }





    }

}
