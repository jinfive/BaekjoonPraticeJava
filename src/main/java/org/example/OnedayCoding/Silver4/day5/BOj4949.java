package org.example.OnedayCoding.Silver4.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOj4949 {
 
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            while(true) {
                String str = br.readLine();
                if(str.equals(".")) {
                    break;
                }

                Deque<Character> dq = new ArrayDeque<>();
                boolean isValid = true;

                for(int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if(ch == '(' || ch == '[') {
                        dq.push(ch);
                    }
                    else if(ch == ')') {
                        if(dq.isEmpty() || dq.peek() != '(') {
                            isValid = false;
                            break;
                        }
                        dq.pop();
                    }
                    else if(ch == ']') {
                        if(dq.isEmpty() || dq.peek() != '[') {
                            isValid = false;
                            break;
                        }
                        dq.pop();
                    }
                }

                if(isValid && dq.isEmpty()) {
                    sb.append("yes\n");
                } else {
                    sb.append("no\n");
                }
            }
            System.out.println(sb.toString());
        }
    }

}
