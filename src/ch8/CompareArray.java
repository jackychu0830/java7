package ch8;

import java.util.Arrays;

public class CompareArray {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a", "b", "c"};
        String[] array3 = {"a", "b", "e"};

        System.out.println("array 1 = " + Arrays.toString(array1));
        System.out.println("array 2 = " + Arrays.toString(array2));
        System.out.println("array 3 = " + Arrays.toString(array3));
        System.out.println("array1 == array2 ? " + Arrays.equals(array1, array2));
        System.out.println("array1 == array3 ? " + Arrays.equals(array1, array3));
    }
}
