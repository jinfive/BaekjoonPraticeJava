package org.example.OnedayCoding.Silver4.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Boj1302 {

    public class Main{
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            Map<String, Integer> myHash = new HashMap<>();
            for(int i = 0 ; i < num ; i++){
                String name = br.readLine();
                myHash.put(name, myHash.getOrDefault(name, 0) + 1);
            }
            Book[] book = new Book[myHash.size()];
            int index = 0;
            for(Map.Entry<String, Integer> et :myHash.entrySet()){
                String name = et.getKey();
                int count = et.getValue();
                book[index] = new Book(name, count);
                index++;
            }
            Arrays.sort(book, (o1, o2) ->{
                if(o1.count != o2.count){
                    return o2.count - o1.count;
                }
                return o1.name.compareTo(o2.name);

            });
            System.out.println(book[0].name);
        }
        private static class Book{
            String name;
            int count;

            public Book(String name, int count){
                this.name = name;
                this.count = count;
            }
        }

    }
}
