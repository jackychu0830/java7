package ch17;

import static java.lang.System.*;
import java.util.*;

public class FormatterExample {

    public static void main(String[] args) {
        double num1 = 12345.678;
        out.printf("Before format: %s%n", num1);
        out.printf("After format: %,.2f%n", num1);

        Date d = new Date();
        out.printf("Before format: %s%n", d);
        out.printf("After format: %tY/%<tm/%<td %<tT%n", d);
    }
}
