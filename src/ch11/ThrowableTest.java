package ch11;

import java.io.*;

public class ThrowableTest {

    public static void main(String argv[]) {
        try {
            FileInputStream f = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("=== toString() ===");
            System.err.println(e);

            System.out.println("=== getLocalizedMessage() ===");
            System.err.println(e.getLocalizedMessage());

            System.out.println("=== getMessage() ===");
            System.err.println(e.getMessage());

            System.out.println("=== printStackTrace() ===");
            e.printStackTrace();
        }
    }
}
