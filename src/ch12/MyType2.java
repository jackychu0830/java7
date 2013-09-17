package ch12;

import java.io.*;

public class MyType2 {

    public static void main(String argv[]) {
        try {
            FileInputStream fin = new FileInputStream("abc.txt");

            while (fin.available() > 0) {
                System.out.print((char) fin.read());
            }

            fin.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}