package ch16;

import java.util.*;

public class ForeachExample3 {

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("Jacky");
        data.add("Piggy");
        data.add("Java");

        for (int i = data.size() - 1; i <= 0; i--) {
            System.out.println(i + ": " + data.get(i));
        }
        System.out.println();

        for (String str : data) {
            System.out.println(str);
        }
    }
}
