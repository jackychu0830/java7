package ch16;

import static java.lang.System.out;
import java.util.*;

public class StaticImportExample {

    public static void main(String[] args) {
        List data = new ArrayList();
        data.add("Jacky");
        data.add("Piggy");
        data.add("Java");

        out.println("Using index get...");
        for (int i = 0; i < data.size(); i++) {
            out.print(data.get(i) + " ");
        }
        out.println();

        out.println("Using iterator...");
        for (Iterator it = data.iterator(); it.hasNext();) {
            out.print(it.next() + " ");
        }
        out.println();

        out.println("Using foreach...");
        for (Object obj : data) {
            out.print(obj + " ");
        }
        out.println();

    }
}
