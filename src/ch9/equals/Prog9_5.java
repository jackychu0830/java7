package ch9.equals;

public class Prog9_5 {

    public static void main(String argv[]) {
        MyObject obj1 = new MyObject(1);
        MyObject obj2 = new MyObject(1);
        MyObject obj3 = new MyObject(3);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
    }
}
