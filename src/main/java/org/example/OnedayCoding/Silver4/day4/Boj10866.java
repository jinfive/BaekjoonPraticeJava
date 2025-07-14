package org.example.OnedayCoding.Silver4.day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj10866 {



    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            Deque<Integer> dq = new ArrayDeque<>();

            int test = Integer.parseInt(br.readLine());

            for(int i = 0 ; i < test ; i++){
                String str = br.readLine();
                String[] sArr = str.split(" ");

                // 인자가 있는 명령어들
                if(sArr[0].equals("push_front")){
                    dq.addFirst(Integer.parseInt(sArr[1]));
                }
                else if(sArr[0].equals("push_back")){
                    dq.addLast(Integer.parseInt(sArr[1]));
                }
                // 인자가 없는 명령어들
                else if(sArr[0].equals("pop_front")){
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.poll() + "\n"); // 앞에서 제거
                    }
                }
                else if(sArr[0].equals("pop_back")){
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.pollLast() + "\n"); // 뒤에서 제거
                    }
                }
                else if(sArr[0].equals("size")){
                    sb.append(dq.size() + "\n");
                }
                else if(sArr[0].equals("empty")){
                    if(dq.isEmpty()){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                }
                else if(sArr[0].equals("front")){
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.peekFirst() + "\n");
                    }
                }
                else if(sArr[0].equals("back")){
                    if(dq.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(dq.peekLast() + "\n");
                    }
                }
            }
            System.out.print(sb.toString());
        }
    }

}
