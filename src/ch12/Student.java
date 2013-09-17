package ch12;

import java.io.*;

public class Student implements Serializable {

    private String name;
    private int chScore, engScore;
    private int mathScore;
    //private transient int mathScore;

    public Student(String n, int c, int e, int m) {
        name = n;
        chScore = c;
        engScore = e;
        mathScore = m;
    }

    public double avgScore() {
        return (chScore + engScore + mathScore) / 3.0;
    }

    public void printData() {
        System.out.println("姓名：" + name);
        System.out.println("國文：" + chScore);
        System.out.println("英文：" + engScore);
        System.out.println("數學：" + mathScore);
        System.out.println("平均：" + avgScore());
    }
}