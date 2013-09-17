package ch9.innerclasses;

public class InnerInterfaceExample implements Outter6.StaticInnerInterface {
}

class Outter6 {

    static interface StaticInnerInterface {
    }

    interface InnerInterface {
    }

    class InnerClass implements InnerInterface {
    }
}