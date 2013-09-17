package ch8;

public class ArrayCopy {

    public static void main(String argv[]) {
        int a[] = new int[5];
        int b[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = i + 1;
            b[i] = 0;
        }

        System.out.println("Before copy...");
        printArray("a", a);
        printArray("b", b);

        System.arraycopy(a, 0, b, 0, a.length);

        System.out.println("After copy...");
        printArray("a", a);
        printArray("b", b);

    }

    public static void printArray(String name, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(name + "[" + i + "]=" + array[i]);
        }
    }
}
