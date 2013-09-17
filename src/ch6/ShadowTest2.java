package ch6;

public class ShadowTest2 {

    public static void main(String argv[]) {
        A a = new A();
        B b = new B();

        System.out.println("a.i = " + a.i);
        System.out.println("b.i = " + b.i);
    }
}

class A5 {

    int i = 10;

    public A5() {
        System.out.println(i);
    }
}

class B5 extends A5 {

    int i = 5;

    public B5() {
        System.out.println(i);
    }
}