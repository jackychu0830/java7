package ch15;

import static ch15.NewDepartment.*;

public class SwitchExample {

    public static void main(String[] args) {
        NewDepartment dept = NewDepartment.valueOf(args[0]);
        switch (dept) {
            case ENGINEER:
                System.out.println("Your job function is coding");
                break;
            case MARKETING:
                System.out.println("Your job function is promoting");
                break;
            default:
                System.out.println("Your job function isn\'t defined!");
        }
    }
}
