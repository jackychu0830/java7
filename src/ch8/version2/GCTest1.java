package ch8.version2;

public class GCTest1 {

    public static void main(String argv[]) {
        Runtime rt = Runtime.getRuntime();

        System.out.println("Program start...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());

        MyObject obj1 = new MyObject(1);
        MyObject obj2 = new MyObject(2);
        MyObject obj3 = new MyObject(3);
        System.out.println("After created three MyObject objects...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());

        obj1 = null;
        obj2 = null;
        obj3 = null;
        System.out.println("After released MyObject objects...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());

    }
}
