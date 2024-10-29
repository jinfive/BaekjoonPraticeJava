package org.example.ProgrammersLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class 가변을배열로옮기기 {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5};
        //n배열 중 3이상 숫자를 찾아서
        int answer[] = {};
        List<Integer> list = new ArrayList<>();
        for(int x : n){
            if(x >= 3){
                list.add(x * 10);
            }
        }
        int size = list.size();
        answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        //10을 곱한 후 list에 모은 후
        //배열로 옮긴 후
        //정렬후 프린트
    }
}