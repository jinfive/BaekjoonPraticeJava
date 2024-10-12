package org.example.Youtube_Jins;

public class P18 {//369게임

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            String x = String.valueOf(i); //valueOf() 정수를 문자열로 변경
            if (x.contains("3") || x.contains("6") || x.contains("9")) {//.contains함수 문자를 포함하고 있냐?
                System.out.print("짝");
            }//if
            else {
                System.out.print(x);
            }
        }//for
    }//main
}//class
