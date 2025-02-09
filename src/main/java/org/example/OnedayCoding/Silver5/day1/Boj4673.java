package org.example.OnedayCoding.Silver5.day1;




public class Boj4673 {
    public static void main(String[] args) {
        boolean[] index =new boolean[10001];
        for (int i = 1; i < 10000; i++) {
            int s= i;

            char[] temp = String.valueOf(i).toCharArray();
            for (int j = 0; j < temp.length; j++) {
                s += Integer.parseInt(String.valueOf(temp[j]));
            }

            if(s<10001){
                index[s]=true;
            }
        }
        for (int i = 1; i < index.length; i++) {
            if(!index[i]){
                System.out.println(i);
            }
        }

    }
}
