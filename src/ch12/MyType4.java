package ch12;

import java.io.*;

public class MyType4 {

    public static void main(String argv[]) {
        try {
            FileReader fin = new FileReader("joke.txt");

            int i = fin.read();

            while (i != -1) {
                System.out.print((char) i);
                i = fin.read();
            }

            fin.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}