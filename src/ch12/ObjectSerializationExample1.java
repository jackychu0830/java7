package ch12;

import java.io.*;

public class ObjectSerializationExample1 {

    public static void main(String argv[]) {
        int c = Integer.parseInt("80");
        int e = Integer.parseInt("60");
        int m = Integer.parseInt("90");

        Student st = new Student("Jacky", c, e, m);
        st.printData();

        try {
            FileOutputStream fout = new FileOutputStream("Data.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);

            objOut.writeObject(st);
            objOut.close();
            fout.close();
        } catch (IOException ie) {
            System.err.println(e);
        }
    }
}