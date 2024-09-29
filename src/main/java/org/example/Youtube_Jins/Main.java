package org.example.Youtube_Jins;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();//담고자(참조형 변수) 하는걸 <>사이에 넣어준다
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student("Jinone", 201921081);
        Student st2 = new Student("Jintwo", 201921082);
        Student st3 = new Student("Jinthree", 201921083);
        Student st4 = new Student("Jinfour", 201921084);
        Student st5 = new Student("Jinfive", 201921085);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        for (Student st : list) {
            System.out.println(st);
        }


        while (true) {
            System.out.println("학생을 검색 하시겠습니까(Yes,No)???");
            String input = sc.nextLine();
            if (input.equals("No")) {
                System.exit(0);
                System.out.println("프로그래밍 종료");
            }//if 문 프로그래밍 종료
            else if (input.equals("Yes")) {
                System.out.print("학생 이름을 입력하세요>>>>");
                String name = sc.nextLine();

                boolean flag = false; //플래그 조건을 검사하기 위해서
                for (Student st : list) {
                    if (name.equals(st.getName())) {
                        System.out.println(st.getNumber());
                        flag = true;
                        break;
                    }//if
                }//for
                if (!flag) {
                    System.out.println("검색하려는 학생이 없습니다.");
                }

            }
        }//while
    }//main
}//class




