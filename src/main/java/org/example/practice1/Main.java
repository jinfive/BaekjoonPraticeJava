package org.example.practice1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        Student st1 = new Student("김진일", 201921081);
        Student st2 = new Student("김진이", 201921082);
        Student st3 = new Student("김진삼", 201921083);
        Student st4 = new Student("김진사", 201921084);
        Student st5 = new Student("김진오", 201921085);


        list.add(st1.toString());
        System.out.println(st1.getName());
        System.out.println(st1.getNumber());

    }
}
