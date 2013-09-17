package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileChannelExample4 {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("data1.txt");
        ByteBuffer b[] = new ByteBuffer[2];
        b[0] = ByteBuffer.allocate(10);
        b[1] = ByteBuffer.allocate(10);

        b[0].putChar('a');
        b[0].putChar('b');
        b[1].putChar('1');
        b[1].putChar('2');
        b[1].putChar('3');
        b[0].flip();
        b[1].flip();

        FileChannel fc = fout.getChannel();
        fc.write(b);
        fc.close();
    }
}