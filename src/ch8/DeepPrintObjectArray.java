package ch8;

import java.util.Arrays;

public class DeepPrintObjectArray {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        int[] array2 = {2, 4, 6};
        Object[] arrays = {array1, array2, new java.util.Date()};

        System.out.println(Arrays.deepToString(arrays));
    }
}
