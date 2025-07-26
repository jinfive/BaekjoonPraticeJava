package org.example.OnedayCoding.Silver4.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bpj1120 {
    class Main {

        public static void main(String[] args) throws Exception {
            // String a = "abr";
            // String b =  "topabcoder";
            // System.out.println(b.contains(a));//true
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            int aLength = A.length();
            int bLength = B.length();
            boolean flag = false;
            int answer = 0;
            if (aLength == bLength) {
                for (int i = 0; i < aLength; i++) {
                    if (A.charAt(i) != B.charAt(i)) {
                        answer++;
                    }
                }
                System.out.println(answer);
                return;
            } else {
                answer = Integer.MAX_VALUE;
                char[] aArr = A.toCharArray();
                char[] bArr = B.toCharArray();
                for (int i = 0; i <= bLength - aLength; i++) {
                    int result = 0;
                    for (int j = 0; j < aLength; j++) {
                        if (aArr[j] != bArr[i + j]) {
                            // System.out.println(aArr[j] +"  " + bArr[i + j]);
                            result++;
                        }
                    }
                    // System.out.println(result);
                    answer = Math.min(answer, result);
                }
                System.out.println(answer);
            }

        }
    }
}
