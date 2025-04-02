package org.example.OnedayCoding.Bronze2.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj12891 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken()); // 입력받은 문자 길이
        int p = Integer.parseInt(st.nextToken()); // 비교 문자 길이

        String str = br.readLine();
        char[] charArr = str.toCharArray();

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int counta = 0;
        int countc = 0;
        int countg = 0;
        int countt = 0;
        int count = 0;

        int startIndex = 0;
        int endIndex = p - 1;

        while(s > endIndex){
            // count++;
            // startIndex++;
            // endIndex++;
            for(int i = startIndex ; i <= endIndex ; i++){
                if(charArr[i] == 'A'){
                    counta++;
                }
                else if(charArr[i] == 'C'){
                    countc++;
                }
                else if(charArr[i] == 'G'){
                    countg++;
                }
                else if(charArr[i] == 'T'){
                    countt++;
                }
                if(a == counta && c == countc && g == countg && t == countt){
                    count++;
                }
            }//for

            startIndex ++;
            endIndex++;
             counta = 0;
             countc = 0;
             countg = 0;
             countt = 0;


        }//while
        System.out.print(count);

    }
}
