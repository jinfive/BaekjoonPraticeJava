package org.example.OnedayCoding.Bronze2.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj1212 {

    // The main method must be in a class named "Main".
    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();

            if(str.equals("0")){
                System.out.println(0);
                return; // 0일 때 바로 종료
            }

            // 첫 문자 처리
            String first = "";
            switch(str.charAt(0)){
                case '1':
                    first = "1";
                    break;
                case '2':
                    first = "10";
                    break;
                case '3':
                    first = "11";
                    break;
                case '4':
                    first = "100";
                    break;
                case '5':
                    first = "101";
                    break;
                case '6':
                    first = "110";
                    break;
                case '7':
                    first = "111";
                    break;
                default:
                    first = "0";
                    break;
            }
            sb.append(first);

            // 나머지 문자 처리
            for(int i = 1; i < str.length(); i++){
                char b = str.charAt(i);
                String mod = "";
                switch(b){
                    case '1':
                        mod = "001";
                        break;
                    case '2':
                        mod = "010";
                        break;
                    case '3':
                        mod = "011";
                        break;
                    case '4':
                        mod = "100";
                        break;
                    case '5':
                        mod = "101";
                        break;
                    case '6':
                        mod = "110";
                        break;
                    case '7':
                        mod = "111";
                        break;
                    default:
                        mod = "000";
                        break;
                }
                sb.append(mod);
            }
            System.out.println(sb.toString());
        }
    }

}
