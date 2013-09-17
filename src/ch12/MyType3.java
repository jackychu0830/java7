package ch12;

import java.io.*;

public class MyType3 {

    public static void main(String argv[]) {
        try {
            FileInputStream fin = new FileInputStream("joke.txt");

            byte buf[] = new byte[64];

            int i = fin.read(buf);
            while (i == 64) {
                System.out.print(new String(buf));
                i = fin.read(buf);
            }

            System.out.print(new String(buf, 0, i));
            fin.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}