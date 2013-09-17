package ch15;

public class Example2 {

    public static void main(String[] args) {
        OldEmployee2 e1 = new OldEmployee2();
        e1.setName("Jacky");
        e1.setId(123);
        e1.setDept(OldDepartment.ENGINEER);
        System.out.println(e1);

        OldEmployee2 e2 = new OldEmployee2();
        e2.setName("Piggy");
        e2.setId(123);
        e2.setDept(100);
        System.out.println(e2);
    }
}
