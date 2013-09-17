package ch8.version2;

public class GCTest4 {

    public static void main(String argv[]) {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Create " + i);
            new MyObject(i);

            if (i % 500 == 0) {
                System.out.println("Begin GC...");
                System.gc();
                System.out.println("End GC...");
            }
        }
        System.out.println("Begin GC...");
        System.gc();
        System.out.println("End GC...");
    }
}
