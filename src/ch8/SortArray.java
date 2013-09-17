package ch8;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 5};
        System.out.println("Before sorting... " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting... " + Arrays.toString(array));
    }
}
