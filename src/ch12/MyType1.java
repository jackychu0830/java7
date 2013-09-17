package ch12;

import java.io.*;

public class MyType1 {

    public static void main(String argv[]) {
        try {
            FileInputStream fin = new FileInputStream("abc.txt");
            //InputStreamReader isr = new InputStreamReader(fin, "UTF8");
            //Reader in = new BufferedReader(isr);
            
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