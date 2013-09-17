package ch13.generic;

import java.util.*;

public class GenericsExample3 {

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("Hello");
        data.add("World");

        for (String str : data) {
            System.out.println(str);
        }
    }
}
