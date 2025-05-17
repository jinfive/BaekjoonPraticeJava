package org.example.OnedayCoding.Bronze1.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj6996 {

    // The main method must be in a class named "Main".
    class Main {
        private static List<Integer> myList;
//     blather & reblath are anagrams.
// maryland & landam are NOT anagrams.

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCase = Integer.parseInt(st.nextToken());

            for(int t = 0 ; t < testCase ; t++){
                st = new StringTokenizer(br.readLine());
                String st1 = st.nextToken();
                char[] arr1 = st1.toCharArray();
                String st2 = st.nextToken();
                char[] arr2 = st2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                boolean flag = true;
                if(arr1.length != arr2.length){
                    flag = false;
                }
                else{
                    for(int i = 0 ; i < arr1.length ;i++){
                        if(arr1[i] != arr2[i]){
                            flag = false;
                            break;
                        }
                    }
                }

                if(flag){
                    System.out.println(st1 + " & " + st2 +" are anagrams.");
                }
                else{
                    System.out.println(st1 + " & " + st2 +" are NOT anagrams.");
                }


            }
        }
    }
}
