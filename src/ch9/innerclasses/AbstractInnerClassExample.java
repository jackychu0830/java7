package ch9.innerclasses;

public class AbstractInnerClassExample extends Outter5.StaticAbstractInnerClass {
}

class Outter5 {

    public static abstract class StaticAbstractInnerClass {
    }

    public abstract class AbstractInnerClass {
    }

    public class Inner extends AbstractInnerClass {
    }
}
