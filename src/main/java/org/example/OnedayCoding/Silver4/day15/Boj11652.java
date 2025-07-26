package org.example.OnedayCoding.Silver4.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj11652 {


    // The main method must be in a class named "Main".
    class Main {
        private static Map<Long, Integer> myMap;
        private static List<Card> cardList;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            myMap = new HashMap<>();

            for(int i = 0  ; i < N ; i++){
                Long input = Long.parseLong(br.readLine());
                myMap.put(input, myMap.getOrDefault(input, 0 ) + 1 );
            }
            cardList = new ArrayList<>();
            for(Map.Entry<Long, Integer> et : myMap.entrySet()){
                Long num = et.getKey();
                int count = et.getValue();
                cardList.add(new Card(num, count));
            }
            Collections.sort(cardList, (o1, o2) -> {
                if(o1.count == o2.count){
                    return Long.compare(o1.num, o2.num);
                }
                return Long.compare(o2.count, o1.count);
            });
            System.out.println(cardList.get(0).num);
        }
        private static class Card{
            Long num;
            int count;
            public Card(Long num, int count){
                this.num = num;
                this.count = count;
            }
        }
    }
}
