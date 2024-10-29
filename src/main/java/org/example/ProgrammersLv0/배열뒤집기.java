package org.example.ProgrammersLv0;

import java.util.Arrays;

public class 배열뒤집기 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        //그대로 옯겨보자
        int[] answer = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            answer[i] = n[i];
        }
        //뒤집어서 옮겨보자.
        int[] answer2 = new int[n.length];
        int j = answer2.length - 1;
        for (int i = 0; i < n.length; i++) {
            answer2[i] = answer[j];
            j--;
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}
