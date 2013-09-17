package ch5;

public class SwitchCase5 {

    public static void main(String argv[]) {
        char yesNo = 'a';

        switch (yesNo) {
            case 'y':
            case 'Y':
                System.out.println("Your input is Yes!");
                break;
            case 'n':
            case 'N':
                System.out.println("Your input is No!");
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}