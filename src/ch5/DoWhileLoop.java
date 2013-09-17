package ch5;

import java.io.IOException;

public class DoWhileLoop {

    public static void main(String argv[]) {
        char input;

        try {
            do {
                System.out.println("請輸入小寫的 n");
                input = (char) System.in.read();
            } while (input != 'n');
        } catch (IOException e) {
        }
        System.out.println("程式結束");
    }
}
