package org.example.OnedayCoding.Silver5.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ2022 {
    
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            Map<String, Integer> carInput = new HashMap<>();
            for(int i = 0 ; i < num ; i++){
                String carName = br.readLine();
                carInput.put(carName, i);
            }

            int[] carOutput = new int[num];
            for(int i = 0 ; i < carOutput.length ; i++){
                String carName = br.readLine();
                carOutput[i] = carInput.get(carName);
            }
            int answer = 0 ;
            for(int now = 0 ; now < num ; now++){
                for(int next = now + 1 ; next < num ; next++){
                    if(carOutput[now] > carOutput[next]){
                        answer++;
                        break;
                    }
                }
            }
            System.out.println(answer);

        }
    }

}
