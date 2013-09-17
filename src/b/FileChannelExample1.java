package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileChannelExample1 {

    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream(args[0]);
        FileChannel fcin = fin.getChannel();
        FileOutputStream fout = new FileOutputStream(args[1]);
        FileChannel fcout = fout.getChannel();

        ByteBuffer bb = ByteBuffer.allocate(1048576); //1 MB
        while (fcin.read(bb) >= 0) {
            bb.flip();
            fcout.write(bb);
            bb.clear();
        }

        fcout.close();
        fcin.close();
        fin.close();
        fout.close();
    }
}