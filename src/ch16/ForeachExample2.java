package ch16;

import java.util.*;

public class ForeachExample2 {

    public static void main(String[] args) {
        Collection<String> data = new HashSet<String>();
        data.add("Jacky");
        data.add("Piggy");
        data.add("Java");

        System.out.println("Using iterator...");
        for (Iterator it = data.iterator(); it.hasNext();) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Using foreach...");
        for (String str : data) {
            System.out.print(str + " ");
        }
        System.out.println();

    }
}
