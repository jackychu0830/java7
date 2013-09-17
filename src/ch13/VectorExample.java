package ch13;

import java.util.*;

public class VectorExample {

    public static void main(String argv[]) {
        Vector vector = new Vector();

        vector.add("abc");
        vector.add(new Integer(3));
        vector.add(new Boolean(true));
        vector.add(new Integer(3));
        System.out.println(vector);

        Enumeration enm = vector.elements();
        vector.remove(0);

        System.out.println(
            enm.nextElement());
        System.out.println(vector);

    }
}