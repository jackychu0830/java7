package b;

import java.nio.*;

public class NewIOExample5 {

    public static void main(String args[]) {
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        CharBuffer b1 = CharBuffer.allocate(10);

        b1.put(c);
        b1.flip();
        b1.position(2);
        CharBuffer b2 = b1.asReadOnlyBuffer();
        b2.position(3);
        print(b1);
        print(b2);

        b1.put(1, 'x');
        b2.put(2, 'y');
    }

    public static void print(Buffer b) {
        System.out.println("Position: " + b.position());
        System.out.println("   Limit: " + b.limit());
        System.out.println("Capacity: " + b.capacity());
    }
}