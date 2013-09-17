package ch13.generic;

import java.util.*;

public class GenericsExample8_1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Jacky");
        names.add("Piggy");
        names.add("Joey");
        print(names);

        List<Integer> data = new LinkedList<Integer>();
        data.add(1);
        data.add(2);
        data.add(3);
        print(data);
    }

    public static void print(List<String> data) {
        for (String str : data) {
            System.out.printf("%S, ", str);
        }
        System.out.println();
    }
}
