package org.example.OnedayCoding.Silver2.Day9;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Boj10799 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char[] cArr = br.readLine().toCharArray();
            Deque<StClass> dq = new ArrayDeque<>();
            List<Size> barList = new ArrayList<>();
            List<Size> lazerList = new ArrayList<>();
            for(int i = 0 ; i < cArr.length ; i++){
                if(cArr[i] == '('){
                    dq.push(new StClass('(', i));
                }
                else if(cArr[i] ==')'){
                    if(!dq.isEmpty() && i -  dq.peek().number == 1){
                        StClass post = dq.pop();
                        lazerList.add(new Size(post.number, i));
                    }
                    else if((!dq.isEmpty() && i -  dq.peek().number != 1)){
                        StClass post = dq.pop();
                        barList.add(new Size(post.number, i));
                    }
                }
            }
            // for(int i = 0 ; i < lazerList.size() ; i++){
            //     System.out.println(lazerList.get(i).start + " " + lazerList.get(i).end);
            // }
            // System.out.println("-----");
            // for(int i = 0 ; i < barList.size() ; i++){
            //     System.out.println(barList.get(i).start + " " + barList.get(i).end);
            // }

            int answer  = 0;
            for(int i = 0 ; i < barList.size() ; i++){
                Size now = barList.get(i);
                int count = 0;
                for(int j = 0 ; j < lazerList.size() ; j++){
                    Size lazer = lazerList.get(j);
                    if(now.start <= lazer.start && now.end >= lazer.end){
                        count++;
                    }
                }
                if(count >= 1){
                    answer += count + 1;
                }
            }
            System.out.println(answer);
        }
        private static class StClass{
            char input;
            int number;
            public StClass(char input, int number){
                this.input = input;
                this.number= number;
            }
        }
        private static class Size{
            int start;
            int end;
            public Size(int start, int end){
                this.start = start;
                this.end = end;
            }
        }
    }
}
