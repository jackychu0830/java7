package ch5;

public class SwitchCase2 {

    public static void main(String argv[]) {
        char input, output = ' ';

        input = 'a';

        switch (input) {
            case 'a':
                output = 'A';
            case 'b':
                output = 'B';
            case 'c':
                output = 'C';
        }

        System.out.println(output);
    }
}