package org.example.OnedayCoding.Bronze1.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1357 {
    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            //String 로 받고 글자별로 char을 받고 이를 int형으로 바꿔보자
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str1 = st.nextToken();
            String str2 = st.nextToken();
            // Rev(Rev(X) + Rev(Y))

            int one = rev(str1);
            int two = rev(str2);
            String sum = (one + two)+"";

            System.out.println(rev(sum));

        }
        private static int rev(String str){
            String reStr ="";
            char[] arr = str.toCharArray();
            for(int i  = arr.length -1 ; i >= 0 ;i--){
                reStr += arr[i];
            }
            return Integer.parseInt(reStr);

        }
    }
}
