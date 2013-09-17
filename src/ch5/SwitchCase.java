package ch5;

public class SwitchCase {

    public static void main(String argv[]) {
        char input, output = ' ';

        input = 'b';

        switch (input) {
            case 'a':
                output = 'A';
                break;
            case 'b':
                output = 'B';
                break;
            case 'c':
                output = 'C';
                break;
        }

        System.out.println(output);
    }
}