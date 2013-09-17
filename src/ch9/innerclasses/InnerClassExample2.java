package ch9.innerclasses;

public class InnerClassExample2 {

    public static void main(String argv[]) {
        InnerClasses out = new InnerClasses();
        InnerClasses.InstantiateInnerClass in;
        in = out.new InstantiateInnerClass();
        in.access();
    }
}