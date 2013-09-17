package ch16;

import static java.lang.Integer.*;
import static java.lang.System.out;

public class StaticImportExample4 {

    public static void main(String[] args) {
        out.println("Integer max value is " + MAX_VALUE);

        int MAX_VALUE = 12345;
        out.println("Max value is " + MAX_VALUE);
    }
}
