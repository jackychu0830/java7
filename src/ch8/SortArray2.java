package ch8;

import java.util.Arrays;

public class SortArray2 {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 5};
        System.out.println("Before sorting... " + Arrays.toString(array));
        Arrays.sort(array, 1, 4);
        System.out.println("After sorting index 1 to index 4... " + Arrays.toString(array));
    }
}
