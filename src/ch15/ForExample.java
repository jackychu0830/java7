package ch15;

public class ForExample {

    public static void main(String[] args) {
        for (NewDepartment dept : NewDepartment.values()) {
            System.out.println(dept);
        }
    }
}
