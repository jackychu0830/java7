package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileChannelExample3 {

    public static void main(String args[]) throws Exception {
        RandomAccessFile fin = new RandomAccessFile("data.txt", "rw");
        FileChannel fc = fin.getChannel();
        MappedByteBuffer mb = fc.map(FileChannel.MapMode.READ_WRITE, 0, fc.size());
        fc.close();
        mb.putChar('x');
    }
}