package ch12;

import java.io.*;

public class MyType5 {

    public static void main(String argv[]) {
        try {
            FileReader fin = new FileReader("joke.txt");
            LineNumberReader lnr = new LineNumberReader(fin);

            String str = lnr.readLine();
            while (str != null) {
                System.out.println(lnr.getLineNumber() + ":" + str);
                str = lnr.readLine();
            }

            lnr.close();
            fin.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}