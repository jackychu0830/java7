package ch7.modifier_default.package2;

import ch7.modifier_default.package1.A;

public class E {

    public E() {
        A a = new A();
        a.p1 = 1;
        a.p2();
        A.p2();
        a.p3();
    }
}