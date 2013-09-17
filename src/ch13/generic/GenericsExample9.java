package ch13.generic;

import java.util.*;

public class GenericsExample9 {

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

    public static void print(List<?> data) {
        for (Iterator<?> it = data.iterator(); it.hasNext();) {
            System.out.printf("%S, ", it.next().toString());
        }
        System.out.println();
    }
}
