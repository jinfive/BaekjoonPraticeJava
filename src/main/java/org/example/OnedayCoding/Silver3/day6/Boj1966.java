package org.example.OnedayCoding.Silver3.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1966 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int test = Integer.parseInt(br.readLine());
            StringBuilder sb= new StringBuilder();
            for(int t= 0 ; t < test ; t++){
                st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int target = Integer.parseInt(st.nextToken());//pos
                if(N == 1){
                    br.readLine();
                    sb.append(1+"\n");
                    continue;
                }
                List<Print> printList = new ArrayList<>();
                Deque<Print> dq = new ArrayDeque<>();
                int point = 0;
                int targetPos = 0;
                st = new StringTokenizer(br.readLine());
                for(int i = 0 ; i < N ; i++){

                    int n = Integer.parseInt(st.nextToken());
                    if(i == target){
                        targetPos = n;
                    }
                    printList.add(new Print(i, n));
                    dq.add(new Print(i, n));
                }
                Collections.sort(printList,(o1, o2) ->{
                    return o2.num - o1.num;
                });
                while (!dq.isEmpty()) {
                    Print now = dq.poll();

                    if(now.num == printList.get(point).num){
                        point++;
                        // 수정 5: 찾는 문서인지 확인 (원래 위치와 우선순위로)
                        if(now.pos == target && now.num == targetPos){
                            sb.append(point + "\n");  // 수정 6: \\n → \n
                            break;
                        }
                    }
                    else{
                        dq.add(now);
                    }


                }
            }
            System.out.print(sb.toString());
        }
        private static class Print{
            int pos;
            int num;
            public Print(int pos, int num){
                this.pos = pos;
                this.num = num;
            }
        }
    }
}
