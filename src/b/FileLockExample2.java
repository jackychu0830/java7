package b;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileLockExample2 {

    private FileChannel fc;

    public static void main(String args[]) throws Exception {
        new FileLockExample2();
    }

    public FileLockExample2() throws Exception {
        FileOutputStream fout = new FileOutputStream("data1.txt");
        fc = fout.getChannel();
        new FileLockThread().start();
        new FileLockThread().start();
    }

    private class FileLockThread extends Thread {

        public void run() {
            String myname = Thread.currentThread().getName();
            try {
                FileLock lock = fc.lock();
                String say = myname + " says 'Hello Java!'";
                ByteBuffer buf = ByteBuffer.wrap(say.getBytes());
                fc.write(buf);
                lock.release();
            } catch (Exception e) {
                System.out.println(myname + ":" + e);
            }
        }
    }
}