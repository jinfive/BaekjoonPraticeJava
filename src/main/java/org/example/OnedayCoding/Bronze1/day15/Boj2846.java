package org.example.OnedayCoding.Bronze1.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2846 {
 

    // The main method must be in a class named "Main".
    class Main {

        private static Deque<Integer> myQue;
        private static int[] inputArr;
        private static ArrayList<Integer> answer;



        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            inputArr = new int[n];
            myQue = new ArrayDeque<>();
            answer = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < n ; i++){
                inputArr[i] = Integer.parseInt(st.nextToken());
            }

            myQue.push(inputArr[0]);
            for(int i = 1 ; i < n ;i++){
                int pre = myQue.peek();

                if(i == n -1){
                    while(myQue.size() != 1){
                        myQue.pop();
                    }
                    int start = myQue.pop();
                    int end = inputArr[i];
                    answer.add(end - start);

                }
                else if(pre < inputArr[i]){
                    myQue.push(inputArr[i]);
                }
                else if(pre >= inputArr[i]){
                    while(myQue.size() != 1){
                        myQue.pop();
                    }
                    int start = myQue.pop();
                    answer.add(pre - start);
                    myQue.push(inputArr[i]);
                }


            }//for
            if(answer.size()==0){
                System.out.println(0);
            }
            else{
                Collections.sort(answer,Collections.reverseOrder());
                System.out.println(answer.get(0));
            }
        }
    }
}
