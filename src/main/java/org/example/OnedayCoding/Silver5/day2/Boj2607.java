package org.example.OnedayCoding.Silver5.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2607 {


    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int test = Integer.parseInt(br.readLine());
            String standard = br.readLine();
            int answer = 0;
            final int SLENGTH = standard.length();
            for(int i = 1 ; i < test ; i++){
                String str = br.readLine();
                if(SLENGTH == str.length() || SLENGTH == str.length() + 1 || SLENGTH == str.length() -1){
                    if(strSort(standard).equals(strSort(str))){
                        answer++;
                        continue;
                    }
                    String sortStandard = strSort(standard);
                    String sortStr = strSort(str);
                    if(sortStandard.length() < sortStr.length()){
                        char a = 'A';
                        for(int j = 0 ; j < 26 ; j++){
                            char change = (char)(a + j);
                            String eqStandard = sortStandard;
                            eqStandard += (change + "");
                            if(strSort(eqStandard).equals(sortStr)){  // 다시 정렬해서 비교
                                answer++;
                                break;
                            }
                        }
                    }
                    // 현재 코드의 if문 뒤에 추가
                    else if(SLENGTH == str.length()) {
                        // 문자 교체 확인
                        int diffCount = 0;
                        for(int j = 0; j < 26; j++) {
                            char c = (char)('A' + j);
                            int count1 = 0, count2 = 0;

                            // standard에서 문자 c의 개수
                            for(char ch : standard.toCharArray()) {
                                if(ch == c) count1++;
                            }

                            // str에서 문자 c의 개수
                            for(char ch : str.toCharArray()) {
                                if(ch == c) count2++;
                            }

                            diffCount += Math.abs(count1 - count2);
                        }

                        // 한 문자 교체시 총 차이는 2 (하나 감소 + 하나 증가)
                        if(diffCount == 2) {
                            answer++;
                        }
                    }

                    else{
                        char a = 'A';
                        for(int j = 0 ; j < 26 ; j++){
                            char change = (char)(a + j);
                            String eqStr = sortStr;
                            eqStr += (change + "");
                            if(strSort(eqStr).equals(sortStandard)){
                                answer++;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(answer);
        }
        private static String strSort(String str){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String r = "";
            for(char c : arr){
                r += c;
            }
            return r;
        }
    }
}
