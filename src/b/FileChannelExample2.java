package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileChannelExample2 {

    public static void main(String args[]) throws Exception {
        RandomAccessFile fin = new RandomAccessFile("data.txt", "rw");
        FileChannel fc = fin.getChannel();
        ByteBuffer mb = ByteBuffer.allocate((int) fc.size());
        fc.read(mb);
        mb.flip();
        fc.close();
        mb.putChar('x');
    }
}