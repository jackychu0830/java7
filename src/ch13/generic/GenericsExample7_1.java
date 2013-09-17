package java2.D;

import java.util.*;

public class GenericsExample7_1 {

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

    public static void print(List data) {
        Iterator it = data.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.printf("%S, ", str);
        }
        System.out.println();
    }
}
