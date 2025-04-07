package org.example.OnedayCoding.Bronze2.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;

public class Boj11286 {


    // The main method must be in a class named "Main".

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            int frist_bs = Math.abs(o1);
            int second_bs = Math.abs(o2);

            if (frist_bs == second_bs) {
                return o1 > o2 ? 1 : -1;
            }
            return frist_bs - second_bs;
        });
        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (myQueue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(n);
            }
        }


    }

}

