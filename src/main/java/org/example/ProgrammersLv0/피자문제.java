package org.example.ProgrammersLv0;

public class 피자문제 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 16;
        //7조각보다 작은 인원
        if(n < 7){
            answer =1;
        } else if ((n % 7) ==0) {
            answer = n / 7;
        }
        else if((n % 7 != 0)){
            answer = n / 7 +1;
        }
        System.out.println(answer);
    }
}
