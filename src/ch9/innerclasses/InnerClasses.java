package ch9.innerclasses;

public class InnerClasses {

    private static String staticAttribute = "Outter class' static attribute";
    private String instantiateAttribute = "Outter class' instantiate attribute";

    public void instantiateMethod() {
        System.out.println("Outter class' intantiate method");
    }

    public static void staticMethod() {
        System.out.println("Outter class' static method");
    }

    public static class StaticInnerClass {

        public StaticInnerClass() {
            System.out.println("static Inner class");
        }

        public void access() {
            System.out.println(staticAttribute);
            staticMethod();
        }
    }

    public class InstantiateInnerClass {

        public InstantiateInnerClass() {
            System.out.println("Instantiate Inner class");
        }

        public void access() {
            System.out.println(instantiateAttribute);
            instantiateMethod();
        }
    }
}