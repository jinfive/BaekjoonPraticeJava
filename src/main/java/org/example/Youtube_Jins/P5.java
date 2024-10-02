package org.example.Youtube_Jins;

public class P5 {//소문자는 대문자 > 대문자는 소문자
    public static void main(String[] args) {
        String input = "HELLOworld";
        char[] chars = input.toCharArray();
//        for(char a:chars){
//            System.out.println(a);
//        }
        //방법1

//        for(char a:chars){
//            if(a >= 65 && a <= 90){
//                a = (char) (a + 32);
//                System.out.print(a);
//            }
//            else if(a >= 97 && a <= 122){
//                a = (char) (a -32);
//                System.out.print(a);
//            }
        //아스키 코드 65 ~ 90 은 대문자
        //아스키코드 97~122 는 소문자
        //서로 32 차이 남.

        System.out.println();
        //방법2
        for (char b : chars) {
            if (b >= 'a' && b <= 'z') {
                b = (char) (b + ('A' - 'a'));
                System.out.print(b);
            } else if (b >= 'A' && b <= 'Z') {
                b = (char) (b - ('A' - 'a'));
                System.out.print(b);

            }
        }


    }//main
}//class
