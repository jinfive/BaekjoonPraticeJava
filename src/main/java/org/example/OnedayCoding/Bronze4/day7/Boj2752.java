package org.example.OnedayCoding.Bronze4.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Boj2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        System.out.println(list.get(0) + " " + list.get(1)+ " " + list.get(2));
        scanner.close();

    }
}
