package org.example.OnedayCoding.Silver5.day1;

public class Boj4673R {

    // The main method must be in a class named "Main".
    class Main {
        private static boolean[] check;

        private static int answer = 0;
        public static void main(String[] args) throws Exception{
            check = new boolean[10001];
            for(int i = 1 ; i < 10001 ; i++){
                int num = i;
                String nStr = i +"";
                for(int j = 0 ; j < nStr.length() ; j++){
                    num += (int)(nStr.charAt(j)-'0');

                }
                if(num < 10001){
                    check[num] = true;
                }
            }
            for(int i = 1 ; i < check.length ; i++){
                if(!check[i]){
                    System.out.println(i);
                }
            }
        }
    }
}
