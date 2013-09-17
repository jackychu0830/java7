package ch9;

public class Prog9_1 {

    public static void main(String argv[]) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        a1 = b1;
        a1 = c1;
        b1 = (B) a1;
        b1 = (B) c1;
    }
}
