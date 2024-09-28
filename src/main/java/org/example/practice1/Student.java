package org.example.practice1;

public class Student {
    private String name;
    private int number;

    public String getName() {
        return name;
    }//게터 name

    public void setNumber(int number) {
        this.number = number;
    }//세터 number

    public int getNumber() {
        return number;
    }//게터 nuber

    public void setName(String name) {
        this.name = name;//세터 name
    }

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

}
