package ch8;

import java.util.Arrays;
import java.util.List;

public class SearchArray2 {

    public static void main(String[] args) {
        String[] array = {"a", "e", "i", "o", "u"};
        List<String> ls = Arrays.asList(array);
        int index = ls.indexOf("o");
        System.out.println(Arrays.toString(array));
        System.out.println("The index of \"o\" is " + index);
    }
}
