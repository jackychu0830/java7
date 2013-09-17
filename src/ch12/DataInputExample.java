package ch12;

import java.io.*;

public class DataInputExample {

    public static void main(String argv[]) {
        try {
            FileInputStream fin = new FileInputStream("123.txt");
            DataInputStream dataIn = new DataInputStream(fin);

            while (fin.available() > 0) {
                System.out.println(dataIn.readDouble());
            }

            dataIn.close();
            fin.close();
        } catch (IOException e) {
            System.err.print(e);
        }
    }
}