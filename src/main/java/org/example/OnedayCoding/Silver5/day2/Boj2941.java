package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String check1 = "dz=";
        String[] check2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};

        int count = 0;
        for (int i = 0; i < str.length(); ) {  // str.length()-1 제거
            if (i < str.length() - 2 && check1.equals(str.substring(i, i + 3))) {
                count++;
                i += 3;
            }
            else if (i < str.length() - 1) {  // 2글자 체크를 위한 조건 추가
                boolean flag = false;
                String now = str.substring(i, i + 2);
                for (String s : check2) {
                    if (now.equals(s)) {
                        count++;
                        i += 2;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    i++;
                    count++;
                }
            }
            else {  // 마지막 한 글자 처리
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
