package ch12;

import java.io.*;

public class MyType6 {

    public static void main(String argv[]) {
        try {
            FileReader fin = new FileReader("joke.txt");

            int i = fin.read();
            int line = 1;
            if (i != -1) {
                System.out.print(line + ":");
            }

            while (i != -1) {
                if ((char) i == '\n') {
                    line++;
                    System.out.print("\n" + line + ":");
                } else {
                    System.out.print((char) i);
                }

                i = fin.read();
            }

            fin.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}