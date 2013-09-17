package ch13.generic;

import java.util.*;

public class GenericsExample6 {

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<String, Integer>();
        data.put("One", 1);
        data.put("Five", 5);

        for (String key : data.keySet()) {
            System.out.printf("(%s, %d)%n", key, data.get(key));
        }
    }
}
