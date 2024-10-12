package org.example.Youtube_Jins;

public class P14_1 {
    public static void main(String[] args) {
        int s= 3;
        int f =5;

        for (int i = 1; i < 9; i++) {
            for (int j = s; j <=f ; j++) {
                System.out.print(j +"*" + i + " = "+ i*j+ "  ");
            }//for
            System.out.println();
        }//for
    }
}
