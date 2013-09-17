package ch8;

import java.util.Arrays;

public class SearchArray {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 3, 5, 9, 11, -5, 30, 100};
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, 11);
        System.out.println(Arrays.toString(array));
        System.out.println("The index of 11 is " + index);
    }
}
