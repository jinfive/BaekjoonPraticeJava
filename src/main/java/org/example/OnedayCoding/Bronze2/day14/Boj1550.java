package org.example.OnedayCoding.Bronze2.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1550 {
    public static void main(String[] args) throws Exception {
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int j = 0;
        long total = 0;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            if(arr[i] == 'A' || arr[i] == 'B' || arr[i] == 'C' || arr[i] == 'D' || arr[i] == 'E' || arr[i] == 'F'){
                switch(arr[i]){
                    case 'A': total += (long)(Math.pow(16,j) * A);
                        j++;
                        break;
                    case 'B': total += (long)(Math.pow(16,j) * B);
                        j++;
                        break;
                    case 'C': total += (long)(Math.pow(16,j) * C);
                        j++;
                        break;
                    case 'D': total += (long)(Math.pow(16,j) * D);
                        j++;
                        break;
                    case 'E': total += (long)(Math.pow(16,j) * E);
                        j++;
                        break;
                    case 'F': total += (long)(Math.pow(16,j) * F);
                        j++;
                        break;

                }


            }
            else{
                total += (long)(Math.pow(16,j) * (int)(arr[i] - '0'));
                j++;
            }

        }
        System.out.println(total);
    }
}
