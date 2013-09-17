package ch7.modifier_protected.package2;

import ch7.modifier_protected.package1.A;

public class D extends A {

    public D() {
        A a = new A();
        a.p1 = 1;
        a.p2();
        A.p2();
        a.p3();
        p1 = 1;
        p2();
        p3();
    }
}