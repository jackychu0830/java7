package ch8;

import java.util.Arrays;

public class DeepCompareArray {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"a", "b", "c"};
        String[] array3 = {"a", "b", "e"};

        Object[] objArray1 = {array1, array2};
        Object[] objArray2 = {array1, array2};
        Object[] objArray3 = {array1, array3};
        
        System.out.println("objArray1 = " + Arrays.deepToString(objArray1));
        System.out.println("objArray2 = " + Arrays.deepToString(objArray2));
        System.out.println("objArray3 = " + Arrays.deepToString(objArray3));
        System.out.println("objArray1 == objArray2 ? " + Arrays.deepEquals(objArray1, objArray2));
        System.out.println("objArray1 == objArray3 ? " + Arrays.deepEquals(objArray1, objArray3));
    }
}
