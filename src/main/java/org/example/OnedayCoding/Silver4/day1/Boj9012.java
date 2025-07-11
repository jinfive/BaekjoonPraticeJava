package org.example.OnedayCoding.Silver4.day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj9012 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < n ; i++){
                String str = br.readLine();
                boolean flag = true;
                Deque<Character> dq = new ArrayDeque<>();
                for(int j = 0 ; j < str.length(); j++){

                    char c = str.charAt(j);
                    if(dq.isEmpty() && c == ')'){
                        flag = false;
                        break;
                    }
                    if(!dq.isEmpty() && dq.peek() ==')'){
                        flag = false;
                        break;
                    }
                    if(c ==')'){
                        if(!dq.isEmpty() && dq.peek() =='('){
                            dq.pop();
                        }
                        else{
                            dq.push(c);
                        }
                    }else{
                        dq.push(c);
                    }


                }
                if(!dq.isEmpty()){
                    flag = false;
                }
                if(flag){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
