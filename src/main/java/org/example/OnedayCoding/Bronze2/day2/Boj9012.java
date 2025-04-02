package org.example.OnedayCoding.Bronze2.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n ; i++){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            if(s.charAt(0) == ')'){
                System.out.println("NO");
            }
            else{
                for(int j = 0 ; j < s.length() ; j++){
                    if(s.charAt(j) == ')'){
                        if(s.charAt(j-1) =='(' ){
                            stack.pop();
                        }
                        else{
                            stack.push(s.charAt(j));
                        }
                    }
                    else{
                        stack.push(s.charAt(j));
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
}
