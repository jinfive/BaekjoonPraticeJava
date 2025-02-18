package org.example.OnedayCoding.Bronze4.Day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Boj5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hd = Integer.parseInt(br.readLine());
        int md = Integer.parseInt(br.readLine());
        int ld = Integer.parseInt(br.readLine());

        int coke = Integer.parseInt(br.readLine());
        int psyda = Integer.parseInt(br.readLine());

        //System.out.println(hd + " " + md + " " + ld + " " + coke + " " + psyda);


        ArrayList<Integer> bugger = new ArrayList<>();
        ArrayList<Integer> drink = new ArrayList<>();

        bugger.add(hd);
        bugger.add(md);
        bugger.add(ld);

        drink.add(coke);
        drink.add(psyda);


        Collections.sort(drink);
        Collections.sort(bugger);


        System.out.println(bugger.get(0)+drink.get(0) - 50);

        //System.out.println(bugger.toString());






        br.close();
    }
}
