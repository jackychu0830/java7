package c;

public class SuppressWarningsExample {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        DeprecatedMethods dm = new DeprecatedMethods();
        dm.foo2();
    }
}
