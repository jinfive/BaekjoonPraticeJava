package org.example.OnedayCoding.Silver4.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bpk22234 {
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            // order 필드를 추가하여 FIFO 순서 보장
            PriorityQueue<Customer> pq = new PriorityQueue<>((o1, o2) -> {
                if(o1.come != o2.come) return o1.come - o2.come;
                return o1.order - o2.order;  // 같은 시간이면 순서로 정렬
            });

            int orderCounter = 0;

            // 초기 N명의 고객 (모두 시간 0에 도착, 순서대로)
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                int come = 0;
                pq.add(new Customer(id, t, come, orderCounter++));
            }

            int M = Integer.parseInt(br.readLine());
            for(int i = 0 ; i  < M ; i++){
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                int come = Integer.parseInt(st.nextToken());
                pq.add(new Customer(id, t, come, orderCounter++));
            }

            for(int time = 0 ; time < W ;){
                if(!pq.isEmpty()){
                    Customer now = pq.peek();



                    now = pq.poll();
                    int divT = now.t;

                    // 실제 처리할 시간 계산 (T초 또는 남은 업무 시간 중 작은 것)
                    int processTime = Math.min(divT, T);

                    for(int i = 0; i < processTime; i++){
                        if(time >= W) break;
                        sb.append(now.id + "\n");
                        time++;
                        divT--;
                    }

                    // 업무가 완료되지 않았다면 다시 큐에 추가
                    if(divT > 0){
                        pq.add(new Customer(now.id, divT, time, orderCounter++));
                    }
                } else {
                    // 큐가 비어있으면 더 이상 처리할 고객이 없음
                    break;
                }
            }
            System.out.println(sb.toString());
        }

        private static class Customer{
            int id;
            int t;      // 남은시간
            int come;   // 도착시간
            int order;  // 순서 (FIFO 보장용)

            public Customer(int id, int t, int come, int order){
                this.id = id;
                this.t = t;
                this.come = come;
                this.order = order;
            }
        }
    }

}
