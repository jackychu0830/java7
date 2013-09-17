package ch17;

import static java.lang.System.*;
import java.text.*;
import java.util.*;

public class OldFormatExample {

    public static void main(String[] args) {
        Format fm1 = new DecimalFormat("#,###.00");
        double num1 = 12345.678;
        out.println("Before format: " + num1);
        out.println("After format: " + fm1.format(num1));

        Format fm2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        out.println("Before format: " + d);
        out.println("After format: " + fm2.format(d));
    }
}
