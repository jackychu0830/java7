package ch9.equals;

public class Prog9_6 {

    public static void main(String argv[]) {
        MyObject obj1 = new MyObject(1);
        MyObject obj2 = new MyObject(1);
        MyObject obj3 = new MyObject(3);

        System.out.println("obj1's hash code :" + obj1.hashCode());
        System.out.println("obj2's hash code :" + obj2.hashCode());
        System.out.println("obj3's hash code :" + obj3.hashCode());
    }
}
