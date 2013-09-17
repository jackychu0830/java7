package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileChannelExample5 {

    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("data1.txt");
        ByteBuffer b[] = new ByteBuffer[2];
        //b[0] = ByteBuffer.allocate(10);
        b[0] = ByteBuffer.allocate(6);
        b[1] = ByteBuffer.allocate(10);
        FileChannel fc = fin.getChannel();
        fc.read(b);
        fc.close();

        b[0].flip();
        b[1].flip();
        while (b[0].hasRemaining()) {
            System.out.println("b[0]: " + b[0].getChar());
        }
        while (b[1].hasRemaining()) {
            System.out.println("b[1]: " + b[1].getChar());
        }
    }
}