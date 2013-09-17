package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileLockExample1 {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("data1.txt");
        FileChannel fc = fout.getChannel();

        try {
            fc.lock(0, Long.MAX_VALUE, true);
        } catch (Exception e) {
            System.out.println(e);
        }

        FileInputStream fin = new FileInputStream("data1.txt");
        FileChannel fc2 = fin.getChannel();

        try {
            fc2.lock(0, Long.MAX_VALUE, false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}