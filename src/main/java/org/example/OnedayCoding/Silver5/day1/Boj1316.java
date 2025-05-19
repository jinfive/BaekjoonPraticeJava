package org.example.OnedayCoding.Silver5.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1316 {

    // The main method must be in a class named "Main".
    class Main {
        private static boolean[] check;
        private static boolean flag;
        private static int answer = 0;
        public static void main(String[] args) throws Exception{
            // System.out.println((int)'a');//97
            // System.out.println((int)'z');//122
            flag = true;
            check = new boolean[123];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());

            for(int t = 0 ; t < testCase ; t++){
                flag = true;
                check = new boolean[123];
                char[] arr = br.readLine().toCharArray();
                if(arr.length == 1){
                    answer++;
                }
                else{
                    check[arr[0]] = true;
                    for(int i = 1;  i < arr.length ; i++){
                        if(arr[i-1] == arr[i]){//전이랑 같을때
                            check[arr[i]] = true;
                            continue;
                        }
                        else if(arr[i-1] != arr[i]){//전이랑 다를때
                            if(check[arr[i]] == true){//전에 나온게 나올때
                                flag = false;
                                break;
                            }
                            //그게 아닐떄
                            check[arr[i]] = true;
                        }

                    }
                    if(flag) answer++;
                }

            }
            System.out.println(answer);
        }
    }
}
