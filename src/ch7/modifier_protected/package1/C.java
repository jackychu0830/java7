package ch7.modifier_protected.package1;

public class C {

    public C() {
        A a = new A();
        a.p1 = 1;
        a.p2();
        A.p2();
        a.p3();
    }
}