package ch8.version2;

public class GCTest3 {

    public static void main(String argv[]) {
        Runtime rt = Runtime.getRuntime();

        System.out.println("Program start...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());

        MyObject obj2 = new MyObject(2);
        MyObject obj1 = new MyObject(1);
        MyObject obj3 = new MyObject(3);
        obj2 = new MyObject(4);
        System.out.println("After created three MyObject objects...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());

        obj3 = null;
        obj2 = null;
        obj1 = null;
        System.out.println("After released MyObject objects...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());

        System.gc();
        System.out.println("After run System.gc()...");
        System.out.println("Free / Total memory (bytes):"
            + rt.freeMemory() + " / " + rt.totalMemory());
    }
}
