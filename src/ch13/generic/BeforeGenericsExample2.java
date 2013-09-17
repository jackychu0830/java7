package ch13.generic;

import java.util.*;

public class BeforeGenericsExample2 {

    public static void main(String[] args) {
        List data = new ArrayList();
        data.add("Hello");
        data.add(new Integer(1));
        data.add("World");

        Iterator it = data.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
