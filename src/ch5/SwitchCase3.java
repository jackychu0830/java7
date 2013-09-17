package ch5;

public class SwitchCase3 {

    public static void main(String argv[]) {
        char yesNo = 'n';

        switch (yesNo) {
            case 'y':
                System.out.println("Your input is Yes!");
                break;
            case 'Y':
                System.out.println("Your input is Yes!");
                break;
            case 'n':
                System.out.println("Your input is No!");
                break;
            case 'N':
                System.out.println("Your input is No!");
                break;
        }
    }
}