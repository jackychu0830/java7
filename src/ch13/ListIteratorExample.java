package ch13;

import java.util.*;

public class ListIteratorExample {

    public static void main(String argv[]) {
        List list = new LinkedList();

        list.add("abc");
        list.add(new Integer(3));
        list.add(new Boolean(true));
        list.add(new Integer(3));
        System.out.println(list);

        ListIterator it = list.listIterator();
        list.set(0, "123");

        System.out.println(it.next());
        System.out.println(list);

    }
}