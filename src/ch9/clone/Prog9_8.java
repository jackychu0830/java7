package ch9.clone;

public class Prog9_8 {

    public static void main(String argv[]) {
        MyObject obj1 = new MyObject(1);
        MyObject obj2 = (MyObject) obj1.clone();

        System.out.println("obj1's data=" + obj1.data);
        System.out.println("obj2's data=" + obj2.data);
        System.out.println("after...");

        obj2.data = 3;
        System.out.println("obj1's data=" + obj1.data);
        System.out.println("obj2's data=" + obj2.data);
    }
}
