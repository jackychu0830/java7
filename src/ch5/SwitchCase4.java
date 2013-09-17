package ch5;

public class SwitchCase4 {

    public static void main(String argv[]) {
        char yesNo = 'n';

        switch (yesNo) {
            case 'y':
            case 'Y':
                System.out.println("Your input is Yes!");
                break;
            case 'n':
            case 'N':
                System.out.println("Your input is No!");
        }
    }
}