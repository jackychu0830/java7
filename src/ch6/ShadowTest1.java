package ch6;

public class ShadowTest1 {

    public static void main(String argv[]) {
        A a = new A();
        B b = new B();

        System.out.println("a.i = " + a.i);
        System.out.println("b.i = " + b.i);
    }
}

class A4 {

    int i = 10;

    public A4() {
        System.out.println(i);
    }
}

class B4 extends A4 {

    public B4() {
        System.out.println(i);
    }
}