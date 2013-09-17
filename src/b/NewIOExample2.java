package b;

import java.nio.*;

public class NewIOExample2 {

    public static void main(String args[]) {
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        ByteBuffer b = ByteBuffer.allocate(10);

        for (int i = 0; i < c.length; i++) {
            b.putChar(c[i]);
        }
        b.flip();

        while (b.hasRemaining()) {
            System.out.print(b.get() + "\t");
        }
        System.out.println();

        b.rewind();
        while (b.hasRemaining()) {
            System.out.print(b.getChar() + "\t");
        }
        System.out.println();

        b.rewind();
        CharBuffer cb = b.asCharBuffer();
        while (cb.hasRemaining()) {
            System.out.print(cb.get() + "\t");
        }
        System.out.println();
    }
}