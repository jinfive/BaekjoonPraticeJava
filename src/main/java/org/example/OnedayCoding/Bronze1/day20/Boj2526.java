package org.example.OnedayCoding.Bronze1.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2526 {
  
    // The main method must be in a class named "Main".
    class Main {
        private static List<Integer> myList;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            //초기화
            myList = new ArrayList<>();
            myList.add(n);
            int mySize = 0;
            int temp = n;
            while(true){
                temp = (temp * n) % p;
                if(myList.contains(temp)){
                    for(int i = 0; i < myList.size(); i++){
                        if(myList.get(i) == temp){
                            mySize = myList.size() - i;
                            break;
                        }
                    }
                    break; // 루프를 빠져나가는 break 문 추가
                }
                else{
                    myList.add(temp);
                }
            }
            System.out.println(mySize);
        }
    }

}
