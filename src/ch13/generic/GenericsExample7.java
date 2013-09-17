package ch13.generic;

import java.util.*;

public class GenericsExample7 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Jacky");
        names.add("Piggy");
        names.add("Joey");
        print(names);
    }

    public static void print(List data) {
        Iterator it = data.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.printf("%S, ", str);
        }
        System.out.println();
    }
}
