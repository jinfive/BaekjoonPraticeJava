package org.example.OnedayCoding.Silver3.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2108 {

    // The main method must be in a class named "Main".
    class Main {
        private static int[] arr;
        private static Map<Integer, Integer> myMap;
        private static List<Num> numList;
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            arr = new int[n];
            myMap = new HashMap<>();
            numList = new ArrayList<>();
            int maxV = Integer.MIN_VALUE;
            int minV = Integer.MAX_VALUE;
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(br.readLine());
                maxV = Math.max(maxV, arr[i]);
                minV = Math.min(minV, arr[i]);
                myMap.put(arr[i] , myMap.getOrDefault(arr[i], 0) + 1);
                sum += arr[i];
            }
            for(Map.Entry<Integer, Integer> et : myMap.entrySet()){
                numList.add(new Num(et.getKey(), et.getValue()));
            }

            Collections.sort(numList, (o1, o2) ->{
                if(o1.feq != o2.feq){
                    return o2.feq - o1.feq;
                }
                return o1.number - o2.number;
            });
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            sb.append(Math.round((double)sum / n)+"\n");
            sb.append(arr[n/2]+"\n");
            int mostFeq = numList.get(0).feq;
            if(numList.size() >= 2){
                if(mostFeq != numList.get(1).feq){
                    sb.append(numList.get(0).number+"\n");
                }
                else{
                    sb.append(numList.get(1).number +"\n");
                }
            }
            else{
                sb.append(numList.get(0).number+"\n");
            }

            sb.append(maxV - minV);

            System.out.print(sb);

        }
        private static class Num{
            int number;
            int feq;
            public Num(int number, int feq){
                this.number = number;
                this.feq= feq;
            }
        }
    }
}
