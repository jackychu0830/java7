package ch13.generic;

import java.util.*;

public class GenericsExample11 {

    public static void main(String[] args) {
        //correct casting
        ArrayList<String> a = new ArrayList<String>();
        List<String> b = a;
        Collection<String> c = b;

        //incorrect casting
        ArrayList<Number> d = new ArrayList<Integer>();
        List<Object> e = a;
    }
}
