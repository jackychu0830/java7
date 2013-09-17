package ch16;

import static java.lang.System.*;

public class BoxingExample5 {

    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = 10;
        byte i3 = (byte) i1;
        int i4 = i2;
        foo(i1);
        foo(i2);
        foo(i3);
        foo(i4);
    }

    public static void foo(long i) {
        out.println("long i = " + i);
    }

    public static void foo(short i) {
        out.println("short i = " + i);
    }

    public static void foo(Integer i) {
        out.println("Integer i = " + i);
    }
}
