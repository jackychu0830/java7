package b;

import java.nio.*;

public class NewIOExample1 {

    public static void main(String args[]) {
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        CharBuffer b = CharBuffer.allocate(10);

        System.out.println("Before put data...");
        print(b);

        b.put(c);
        System.out.println("Afert put data...");
        print(b);

        System.out.println("Before flip get data at position 7");
        System.out.println("Read '" + b.get(7) + "'");
        print(b);

        System.out.println("After flip");
        b.flip();
        print(b);
        System.out.println("Get data at position 7");
        System.out.println("Read '" + b.get(7) + "'");
    }

    public static void print(Buffer b) {
        System.out.println("\tPosition: " + b.position());
        System.out.println("\t   Limit: " + b.limit());
        System.out.println("\tCapacity: " + b.capacity());
    }
}