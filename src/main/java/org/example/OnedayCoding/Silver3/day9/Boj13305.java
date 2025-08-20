package org.example.OnedayCoding.Silver3.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj13305
{

    class Main {
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            long[] street = new long[n - 1];
            long[] val = new long[n - 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n - 1; i++){
                street[i] = Long.parseLong(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n - 1; i++){
                val[i] = Long.parseLong(st.nextToken());
            }
            st.nextToken();

            long answer = 0;
            int vPoint = 0; // 현재 주유하는 주유소

            for(int sPoint = 0; sPoint < street.length; sPoint++){
                // 다음 주유소가 현재 주유소보다 저렴한가?
                if(sPoint + 1 < val.length && val[sPoint + 1] < val[vPoint]){
                    vPoint = sPoint + 1; // 더 저렴한 주유소로 변경
                }

                answer += val[vPoint] * street[sPoint];
            }

            System.out.println(answer);
        }
    }

}
