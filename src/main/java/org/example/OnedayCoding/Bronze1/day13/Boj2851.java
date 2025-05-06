package org.example.OnedayCoding.Bronze1.day13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj2851 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] A;
        private static int sum;
        private static int index;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            A = new int[10];
            sum = 0;
            index = 0;
            int save1 = 0;
            int save2 = 0;
            boolean flag = false;
            for(int i = 0 ; i < 10 ; i++){
                A[i] = Integer.parseInt(br.readLine());
            }

            for(index  = 0; index < 10 ; index++){
                sum+= A[index];
                if(sum >= 100){
                    save1 = sum;
                    save2 = sum - A[index];
                    flag = true;
                    break;
                }
            }


            // System.out.println(save1);
            // System.out.println(save2);
            int temp1 = save1;
            int temp2 = save2;
            save1 = Math.abs(100 - save1);
            save2 = Math.abs(100 - save2);

            if(!flag){
                System.out.println(sum);
            }
            else if(save1 > save2 && flag){
                System.out.println(temp2);
            }
            else if(save1 == save2 && flag){
                System.out.println(Math.max(temp1,temp2));
            }
            else{
                System.out.println(temp1);
            }
        }
    }
}
