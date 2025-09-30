package org.example.OnedayCoding.Silver2.Day6;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Boj1003 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            Node[] node = new Node[41];
            node[0] = new Node(1, 0);
            node[1] = new Node(0, 1);
            for(int i = 2 ; i < 41 ; i++){
                int zero = node[i - 1].zero + node[i-2].zero;
                int one = node[i - 1].one + node[i-2].one;
                node[i] = new Node(zero, one);
            }
            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < n ; i++){
                int num = Integer.parseInt(br.readLine());
                sb.append(node[num].zero + " " + node[num].one + "\n");
            }
            System.out.print(sb.toString());
        }
        private static class Node{
            int zero;
            int one;
            public Node(int zero, int one){
                this.zero = zero;
                this.one = one;
            }
        }
    }
}
