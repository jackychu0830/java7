package b;

import java.nio.*;

public class NewIOExample4 {

    public static void main(String args[]) {
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        CharBuffer b1 = CharBuffer.allocate(10);

        b1.put(c);
        b1.flip();
        b1.position(2);
        CharBuffer b2 = b1.slice();
        print(b1);
        print(b2);

        while (b2.hasRemaining()) {
            System.out.print(b2.get() + " ");
        }
        System.out.println();

        b1.put(4, 'x');
        b2.rewind();
        while (b2.hasRemaining()) {
            System.out.print(b2.get() + " ");
        }
        System.out.println();
    }

    public static void print(Buffer b) {
        System.out.println("Position: " + b.position());
        System.out.println("   Limit: " + b.limit());
        System.out.println("Capacity: " + b.capacity());
    }
}