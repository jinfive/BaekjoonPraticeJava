package org.example.OnedayCoding.Silver3.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13305 {


//        public static void main(String[] args) throws Exception{
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int n = Integer.parseInt(br.readLine());
//            long[] street = new long[n - 1];
//            long[] val = new long[n - 1];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int i = 0; i < n - 1; i++){
//                street[i] = Long.parseLong(st.nextToken());
//            }
//
//            st = new StringTokenizer(br.readLine());
//            for(int i = 0; i < n - 1; i++){
//                val[i] = Long.parseLong(st.nextToken());
//            }
//            st.nextToken();
//
//            long answer = 0;
//            int vPoint = 0; // 현재 주유하는 주유소
//
//            for(int sPoint = 0; sPoint < street.length; sPoint++){
//                // 다음 주유소가 현재 주유소보다 저렴한가?
//                if(sPoint + 1 < val.length && val[sPoint + 1] < val[vPoint]){
//                    vPoint = sPoint + 1; // 더 저렴한 주유소로 변경
//                }
//
//                answer += val[vPoint] * street[sPoint];
//            }
//
//            System.out.println(answer);
//        }
//    }


    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            long[] street = new long[n - 1];
            long[] oilBank = new long[n]; // 크기를 n으로 변경

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n - 1; i++) {
                street[i] = Long.parseLong(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) { // n개의 주유소 가격 입력
                oilBank[i] = Long.parseLong(st.nextToken());
            }
            // st.nextToken() 제거

            int point = 0;
            long oilPrice = oilBank[0];
            long sum = 0;
            long answer = 0;

            while (point < n - 1) {
                if (oilBank[point] < oilPrice) {
                    answer += (sum * oilPrice);
                    sum = 0;
                    sum += street[point];
                    oilPrice = oilBank[point];
                    point++;
                } else {
                    sum += street[point];
                    point++;
                }
            }
            answer += (sum * oilPrice); // 마지막 비용 추가

            System.out.println(answer);
        }
    }
}
