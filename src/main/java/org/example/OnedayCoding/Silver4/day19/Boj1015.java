package org.example.OnedayCoding.Silver4.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj1015 {
   

    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Node> node = new ArrayList<>();
            int[] p = new int[n];

            for(int i = 0 ; i < n ; i++){
                node.add(new Node(Integer.parseInt(st.nextToken()), i));
            }

            Collections.sort(node, (o1, o2) -> {
                return o1.v - o2.v;
            });

            // Assign values to p array
            for(int i = 0 ; i < n ; i++){
                p[node.get(i).index] = i;
            }

            // Print the result
            for(int i = 0 ; i < n ; i++){
                System.out.print(p[i] + " ");
            }
        }

        private static class Node{
            int v;
            int index;
            public Node(int v, int index){
                this.v = v;
                this.index = index;
            }
        }
    }

}
