package ch13.generic;

import java.util.*;

public class GenericsExample {

    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("Hello");
        data.add("World");

        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
