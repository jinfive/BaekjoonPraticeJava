package org.example.Youtube_Jins;


import java.util.ArrayList;
import java.util.Scanner;

public class Rq1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Students s = new Students();
        s.name = "kjo";
        s.age = 20;
        Students s2 = new Students();
        s2.name = "kwl";
        s2.age = 22;
        Students s3 = new Students();
        s3.name = "kys";
        s3.age = 23;
        Students s4 = new Students();
        s4.name = "ysj";
        s4.age = 24;

        ArrayList<Students> students = new ArrayList<>();
        students.add(s);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        while (true){
            System.out.println("학생 이름을 입력하세요");
            String name = sc.nextLine();
            boolean flag = false;
            for(Students st : students){
                if(name.equals(st.name)){
                    System.out.println(st.age);
                    flag = true;
                    break;
                }
            }//for
            if(!flag){
                System.out.println("찾으시는 학생이 없음");

            }
            System.out.println("계속해서 검색 하시겠습니까");
            String input = sc.nextLine();
            if(input.equals("n")){
                break;
            }
        }//while


    }
}

class Students{

    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
