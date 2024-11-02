package org.example.Youtube_Jins;

import java.util.Scanner;

public class Q29_A {
    public static void main(String[] args) {
        Answer a = new Answer();
        a.sol();
    }

}

class Answer{
   public void sol(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
       System.out.println("숫자를 입력해주세요>");

        for(int i =0 ; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }//for
        boolean aflag = true;
        boolean bflag = true;

        if(arr[0] != 1){
            aflag = false;
        }
        for(int i =0 ; i < arr.length -1 ;i++){
            if(arr[i] - arr[i +1 ] != -1){
                aflag = false;
            }
        }//for
        if(arr[0]!=8){
            bflag = false;
        }
        for(int i =0 ; i < arr.length -1 ;i++){
            if(arr[i] - arr[i +1 ] != 1){
                bflag = false;
            }
        }//for
        if(aflag){
            System.out.println("Asc");
        }
        else if(bflag){
            System.out.println("desc");
        }
        else {
            System.out.println("Mix");
        }

    }
}